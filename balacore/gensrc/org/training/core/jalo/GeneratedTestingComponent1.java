/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 18, 2021, 12:47:30 PM                   ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.BalaCoreConstants;

/**
 * Generated class for type {@link org.training.core.jalo.TestingComponent1 TestingComponent1}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTestingComponent1 extends SimpleCMSComponent
{
	/** Qualifier of the <code>TestingComponent1.display</code> attribute **/
	public static final String DISPLAY = "display";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DISPLAY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestingComponent1.display</code> attribute.
	 * @return the display
	 */
	public String getDisplay(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DISPLAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestingComponent1.display</code> attribute.
	 * @return the display
	 */
	public String getDisplay()
	{
		return getDisplay( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestingComponent1.display</code> attribute. 
	 * @param value the display
	 */
	public void setDisplay(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DISPLAY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestingComponent1.display</code> attribute. 
	 * @param value the display
	 */
	public void setDisplay(final String value)
	{
		setDisplay( getSession().getSessionContext(), value );
	}
	
}
