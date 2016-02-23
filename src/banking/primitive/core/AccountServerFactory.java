/*
  File:	AccountServerFactory.java
  Author:	Dr. Kevin Gary
  Date:	2-20-2016
  
  Description: Serves new Serversolution objects 
*/
package banking.primitive.core;


public class AccountServerFactory {

	protected static AccountServerFactory singleton = null;

	protected AccountServerFactory() {

	}

	public static AccountServerFactory getMe() {
		if (singleton == null) {
			singleton = new AccountServerFactory();
		}

		return singleton;
	}

	public AccountServer lookup() {
		return new ServerSolution();
	}
}
