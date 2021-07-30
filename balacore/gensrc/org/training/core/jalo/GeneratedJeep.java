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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Jeep}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedJeep extends GenericItem
{
	/** Qualifier of the <code>Jeep.ts</code> attribute **/
	public static final String TS = "ts";
	/** Qualifier of the <code>Jeep.sa</code> attribute **/
	public static final String SA = "sa";
	/** Qualifier of the <code>Jeep.sa1</code> attribute **/
	public static final String SA1 = "sa1";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TS, AttributeMode.INITIAL);
		tmp.put(SA, AttributeMode.INITIAL);
		tmp.put(SA1, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Jeep.sa</code> attribute.
	 * @return the sa
	 */
	public String getSa(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Jeep.sa</code> attribute.
	 * @return the sa
	 */
	public String getSa()
	{
		return getSa( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Jeep.sa</code> attribute. 
	 * @param value the sa
	 */
	public void setSa(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Jeep.sa</code> attribute. 
	 * @param value the sa
	 */
	public void setSa(final String value)
	{
		setSa( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Jeep.sa1</code> attribute.
	 * @return the sa1
	 */
	public String getSa1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SA1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Jeep.sa1</code> attribute.
	 * @return the sa1
	 */
	public String getSa1()
	{
		return getSa1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Jeep.sa1</code> attribute. 
	 * @param value the sa1
	 */
	public void setSa1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SA1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Jeep.sa1</code> attribute. 
	 * @param value the sa1
	 */
	public void setSa1(final String value)
	{
		setSa1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Jeep.ts</code> attribute.
	 * @return the ts
	 */
	public String getTs(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Jeep.ts</code> attribute.
	 * @return the ts
	 */
	public String getTs()
	{
		return getTs( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Jeep.ts</code> attribute. 
	 * @param value the ts
	 */
	public void setTs(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Jeep.ts</code> attribute. 
	 * @param value the ts
	 */
	public void setTs(final String value)
	{
		setTs( getSession().getSessionContext(), value );
	}
	
}
