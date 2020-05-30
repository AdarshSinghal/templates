
/*
Information Classification / DC2
RESTRICTED - NOT FOR EXTERNAL DISTRIBUTION
 
This material is the property of Global Payments and is intended solely for its use. This material is proprietary to Global Payments and has been furnished on a confidential and restricted basis.  Global Payments expressly reserves all rights, without waiver, election, or other limitation to the full extent permitted by law, and to this material and this information contained therein.  Any reproduction, use or display or other disclosure or dissemination, by a method now known or later developed, of this material or the information contained therein, in whole or in art, without prior written consent of Global Payments is strictly prohibited. Copyright © 2014-2019
*/
package com.sample.data.controller.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationExceptionControllerAdvice {

	@ExceptionHandler(value = Exception.class)
	public String exception(Exception exception) {
		return exception.getMessage();
	}

}
