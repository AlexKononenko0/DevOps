/**
 * Oleksandr Kononenko
 * <p>
 * Copyright (c) 1993-1996 Sun Microsystems, Inc. All Rights Reserved.
 * <p>
 * This software is the confidential and proprietary information of Sun
 * Microsystems, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Sun.
 * <p>
 * SUN MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
 * THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 * TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. SUN SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */
package kononenko.devops;

import org.apache.log4j.Logger;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * The {@code Input} class contains methods for entering two numbers and selecting an arithmetic operation on them.
 *
 * @author Oleksandr Kononenko
 * @version 1.10 4 Aug 2022
 */
public class Input {

    private static final Logger logger = Logger.getLogger(Input.class);

    static Scanner input = new Scanner(System.in);

    /**
     * Code serves for corresponds to keyboard numbers input or another input source specified.
     *
     * @return num - BigInteger
     */
    BigInteger getBigInteger() {
        logger.info("Enter an number: ");
        BigInteger num;
        if (input.hasNextBigInteger()) {
            num = input.nextBigInteger();
        } else {
            logger.info("You made a mistake while entering the number, please try again.");
            input.next();//рекурсия
            num = getBigInteger();
        }
        return num;
    }

    /**
     * Code serves for corresponds to keyboard numbers input or another input source specified.
     *
     * @return operation - char
     */
    char getOperation() {
        logger.info("Enter an operation: ");
        char operation;
        if (input.hasNext()) {
            operation = input.next().charAt(0);
        } else {
            logger.info("You made a mistake while entering the operation, please try again.");
            input.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }
}