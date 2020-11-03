package Methods;

public class Sel_049_XPATHCustumize {

	public static void main(String[] args) {
		
		/*
		 * XPATH
			=========
			
			Basic xpath
			http://demo.guru99.com/v1/
			
			UserID
			==========
			//input[@name='uid']
			//input[@onkeyup='validateuserid();']
			//input[@text='password']
			
			Login
			======
			//input[@name='btnLogin']
			//input[@value='LOGIN']
			
			
			Contains (Reset: http://demo.guru99.com/v1/)
			==========
			//input[contains(@type, 'reset')]
			//input[contains(@type, 'sub')] (burda submitin yarisini al)
			//span[contains(text(), '* mandatory field')] (*mandatory field section)
			
			OR and AND (Submit button)
			============
			//input[@type='submit' or @value='LOGIN']
			//input[@type='submit' or @name='btnLogin']
			
			start-with function
			====================
			http://demo.guru99.com/Security/SEC_V1/index.php
			//label[starts-with(@id, 'message')]
			
			text()
			===========
			//td[text()='UserID']
			
			following
			============
			//*[@type='password']//following::input
			//*[@type='password']//following::input[1]
			//*[@type='password']//following::input[2]
			
			ancestor axis
			================
			//https://www.guru99.com/
			
			//*[text()='Testing']//ancestor::div
			//*[text()='Testing']//ancestor::div[1]
			//*[text()='Testing']//ancestor::div[2]
			
			child
			=============
			(go to selenium link under the Testing)
			
			//*[@id='java_technologies']//child::li
			//*[@id='java_technologies']//child::li[1]
			
			preceding
			============
			http://demo.guru99.com/Security/SEC_V1/index.php#
			
			//*[@type='submit']//preceding::input
			
			following-sibling
			===================
			http://demo.guru99.com/Security/SEC_V1/index.php#
			
			//*[@type='submit']//following-sibling::input
			
			parent
			=============
			//https://www.guru99.com/
			
			//ul[@id='java_technologies']//parent::div
			
			self
			=========
			//*[@type='password']//self::input
		 * 
		 * 
		 */

	}

}
