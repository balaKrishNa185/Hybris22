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
 * Generated class for type {@link org.training.core.jalo.DisplayComponent DisplayComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedDisplayComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>DisplayComponent.count</code> attribute **/
	public static final String COUNT = "count";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COUNT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DisplayComponent.count</code> attribute.
	 * @return the count
	 */
	public Integer getCount(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, COUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DisplayComponent.count</code> attribute.
	 * @return the count
	 */
	public Integer getCount()
	{
		return getCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DisplayComponent.count</code> attribute. 
	 * @return the count
	 */
	public int getCountAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCount( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DisplayComponent.count</code> attribute. 
	 * @return the count
	 */
	public int getCountAsPrimitive()
	{
		return getCountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DisplayComponent.count</code> attribute. 
	 * @param value the count
	 */
	public void setCount(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, COUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DisplayComponent.count</code> attribute. 
	 * @param value the count
	 */
	public void setCount(final Integer value)
	{
		setCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DisplayComponent.count</code> attribute. 
	 * @param value the count
	 */
	public void setCount(final SessionContext ctx, final int value)
	{
		setCount( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DisplayComponent.count</code> attribute. 
	 * @param value the count
	 */
	public void setCount(final int value)
	{
		setCount( getSession().getSessionContext(), value );
	}
	
}
