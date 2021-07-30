/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 18, 2021, 12:47:30 PM                   ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.BalaCoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Test2}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTest2 extends GenericItem
{
	/** Qualifier of the <code>Test2.ts</code> attribute **/
	public static final String TS = "ts";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Test2.ts</code> attribute.
	 * @return the ts
	 */
	public String getTs(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Test2.ts</code> attribute.
	 * @return the ts
	 */
	public String getTs()
	{
		return getTs( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Test2.ts</code> attribute. 
	 * @param value the ts
	 */
	public void setTs(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Test2.ts</code> attribute. 
	 * @param value the ts
	 */
	public void setTs(final String value)
	{
		setTs( getSession().getSessionContext(), value );
	}
	
}
