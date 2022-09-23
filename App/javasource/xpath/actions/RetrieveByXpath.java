// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package xpath.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import xpath.helper.xpathHelper;
import java.util.List;

public class RetrieveByXpath extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private java.lang.String ReturnObjectType;
	private IMendixObject __Xpath;
	private xpath.proxies.Xpath Xpath;
	private java.lang.Long Amount;
	private java.lang.Long Offset;

	public RetrieveByXpath(IContext context, java.lang.String ReturnObjectType, IMendixObject Xpath, java.lang.Long Amount, java.lang.Long Offset)
	{
		super(context);
		this.ReturnObjectType = ReturnObjectType;
		this.__Xpath = Xpath;
		this.Amount = Amount;
		this.Offset = Offset;
	}

	@java.lang.Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		this.Xpath = this.__Xpath == null ? null : xpath.proxies.Xpath.initialize(getContext(), __Xpath);

		// BEGIN USER CODE

		int amount;
		int offset;
		if (Amount != null && Offset != null){

			amount = Math.toIntExact(Amount);
			offset = Math.toIntExact(Offset);
		} else {
			amount = 0;
			offset = 0;
		}

		List<IMendixObject> result = xpathHelper.retrieveByXpath(getContext(), amount, offset, ReturnObjectType, Xpath);
		return result == null ? null : result;

		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "RetrieveByXpath";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
