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

import java.math.BigInteger;

/**
 * The {@code Main} class serves to enter the program and call methods from another java classes.
 *
 * @author Oleksandr Kononenko
 * @version 1.10 30 Dec 2023
 */
public class Main {

    public static void main(String[] args) {
        Input input = new Input();
        Calculations calculations = new Calculations();
        Output output = new Output();

        BigInteger num1 = input.getBigInteger();
        BigInteger num2 = input.getBigInteger();
        char operation = input.getOperation();
        BigInteger result = calculations.calc(num1, num2, operation);
        output.output(result);
    }

}
