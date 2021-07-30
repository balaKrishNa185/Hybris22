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
 * Generated class for type {@link org.training.core.jalo.LatestProductsComponent LatestProductsComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedLatestProductsComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>LatestProductsComponent.noofLatest</code> attribute **/
	public static final String NOOFLATEST = "noofLatest";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NOOFLATEST, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LatestProductsComponent.noofLatest</code> attribute.
	 * @return the noofLatest
	 */
	public Integer getNoofLatest(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFLATEST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LatestProductsComponent.noofLatest</code> attribute.
	 * @return the noofLatest
	 */
	public Integer getNoofLatest()
	{
		return getNoofLatest( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LatestProductsComponent.noofLatest</code> attribute. 
	 * @return the noofLatest
	 */
	public int getNoofLatestAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoofLatest( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LatestProductsComponent.noofLatest</code> attribute. 
	 * @return the noofLatest
	 */
	public int getNoofLatestAsPrimitive()
	{
		return getNoofLatestAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LatestProductsComponent.noofLatest</code> attribute. 
	 * @param value the noofLatest
	 */
	public void setNoofLatest(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFLATEST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LatestProductsComponent.noofLatest</code> attribute. 
	 * @param value the noofLatest
	 */
	public void setNoofLatest(final Integer value)
	{
		setNoofLatest( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LatestProductsComponent.noofLatest</code> attribute. 
	 * @param value the noofLatest
	 */
	public void setNoofLatest(final SessionContext ctx, final int value)
	{
		setNoofLatest( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LatestProductsComponent.noofLatest</code> attribute. 
	 * @param value the noofLatest
	 */
	public void setNoofLatest(final int value)
	{
		setNoofLatest( getSession().getSessionContext(), value );
	}
	
}
