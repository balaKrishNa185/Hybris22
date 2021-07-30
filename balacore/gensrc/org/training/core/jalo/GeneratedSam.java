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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Sam}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedSam extends GenericItem
{
	/** Qualifier of the <code>Sam.xDaysOld</code> attribute **/
	public static final String XDAYSOLD = "xDaysOld";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(XDAYSOLD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sam.xDaysOld</code> attribute.
	 * @return the xDaysOld
	 */
	public Integer getXDaysOld(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, XDAYSOLD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sam.xDaysOld</code> attribute.
	 * @return the xDaysOld
	 */
	public Integer getXDaysOld()
	{
		return getXDaysOld( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sam.xDaysOld</code> attribute. 
	 * @return the xDaysOld
	 */
	public int getXDaysOldAsPrimitive(final SessionContext ctx)
	{
		Integer value = getXDaysOld( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sam.xDaysOld</code> attribute. 
	 * @return the xDaysOld
	 */
	public int getXDaysOldAsPrimitive()
	{
		return getXDaysOldAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sam.xDaysOld</code> attribute. 
	 * @param value the xDaysOld
	 */
	public void setXDaysOld(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, XDAYSOLD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sam.xDaysOld</code> attribute. 
	 * @param value the xDaysOld
	 */
	public void setXDaysOld(final Integer value)
	{
		setXDaysOld( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sam.xDaysOld</code> attribute. 
	 * @param value the xDaysOld
	 */
	public void setXDaysOld(final SessionContext ctx, final int value)
	{
		setXDaysOld( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sam.xDaysOld</code> attribute. 
	 * @param value the xDaysOld
	 */
	public void setXDaysOld(final int value)
	{
		setXDaysOld( getSession().getSessionContext(), value );
	}
	
}
