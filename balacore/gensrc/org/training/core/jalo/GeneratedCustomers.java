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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.BalaCoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Customers}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCustomers extends GenericItem
{
	/** Qualifier of the <code>Customers.customerCreated</code> attribute **/
	public static final String CUSTOMERCREATED = "customerCreated";
	/** Qualifier of the <code>Customers.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Customers.place</code> attribute **/
	public static final String PLACE = "place";
	/** Qualifier of the <code>Customers.isNeworOld</code> attribute **/
	public static final String ISNEWOROLD = "isNeworOld";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CUSTOMERCREATED, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(PLACE, AttributeMode.INITIAL);
		tmp.put(ISNEWOROLD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customers.customerCreated</code> attribute.
	 * @return the customerCreated
	 */
	public Date getCustomerCreated(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CUSTOMERCREATED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customers.customerCreated</code> attribute.
	 * @return the customerCreated
	 */
	public Date getCustomerCreated()
	{
		return getCustomerCreated( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customers.customerCreated</code> attribute. 
	 * @param value the customerCreated
	 */
	public void setCustomerCreated(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CUSTOMERCREATED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customers.customerCreated</code> attribute. 
	 * @param value the customerCreated
	 */
	public void setCustomerCreated(final Date value)
	{
		setCustomerCreated( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customers.isNeworOld</code> attribute.
	 * @return the isNeworOld
	 */
	public Boolean isIsNeworOld(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISNEWOROLD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customers.isNeworOld</code> attribute.
	 * @return the isNeworOld
	 */
	public Boolean isIsNeworOld()
	{
		return isIsNeworOld( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customers.isNeworOld</code> attribute. 
	 * @return the isNeworOld
	 */
	public boolean isIsNeworOldAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsNeworOld( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customers.isNeworOld</code> attribute. 
	 * @return the isNeworOld
	 */
	public boolean isIsNeworOldAsPrimitive()
	{
		return isIsNeworOldAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customers.isNeworOld</code> attribute. 
	 * @param value the isNeworOld
	 */
	public void setIsNeworOld(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISNEWOROLD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customers.isNeworOld</code> attribute. 
	 * @param value the isNeworOld
	 */
	public void setIsNeworOld(final Boolean value)
	{
		setIsNeworOld( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customers.isNeworOld</code> attribute. 
	 * @param value the isNeworOld
	 */
	public void setIsNeworOld(final SessionContext ctx, final boolean value)
	{
		setIsNeworOld( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customers.isNeworOld</code> attribute. 
	 * @param value the isNeworOld
	 */
	public void setIsNeworOld(final boolean value)
	{
		setIsNeworOld( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customers.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customers.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customers.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customers.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customers.place</code> attribute.
	 * @return the place
	 */
	public String getPlace(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PLACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customers.place</code> attribute.
	 * @return the place
	 */
	public String getPlace()
	{
		return getPlace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customers.place</code> attribute. 
	 * @param value the place
	 */
	public void setPlace(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PLACE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customers.place</code> attribute. 
	 * @param value the place
	 */
	public void setPlace(final String value)
	{
		setPlace( getSession().getSessionContext(), value );
	}
	
}
