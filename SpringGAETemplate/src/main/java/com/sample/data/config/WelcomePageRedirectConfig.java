
/*
Information Classification / DC2
RESTRICTED - NOT FOR EXTERNAL DISTRIBUTION
 
This material is the property of Global Payments and is intended solely for its use. This material is proprietary to Global Payments and has been furnished on a confidential and restricted basis.  Global Payments expressly reserves all rights, without waiver, election, or other limitation to the full extent permitted by law, and to this material and this information contained therein.  Any reproduction, use or display or other disclosure or dissemination, by a method now known or later developed, of this material or the information contained therein, in whole or in art, without prior written consent of Global Payments is strictly prohibited. Copyright © 2014-2019
*/
package com.sample.data.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.sample.data.constants.Constants;

//If you move this into Controller package, it will be listed in Swagger which we dont want. 
//Another approach is to configure swagger to ignore this particular controller
@Controller
public class WelcomePageRedirectConfig {

	@GetMapping("/")
	public RedirectView redirectWithUsingRedirectView(RedirectAttributes attributes) {
		return new RedirectView(Constants.SWAGGER_UI_PAGE_ADDRESS);
	}

}
