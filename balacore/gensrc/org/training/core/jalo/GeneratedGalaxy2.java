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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Galaxy2}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedGalaxy2 extends GenericItem
{
	/** Qualifier of the <code>Galaxy2.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Galaxy2.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Galaxy2.no</code> attribute **/
	public static final String NO = "no";
	/** Qualifier of the <code>Galaxy2.model</code> attribute **/
	public static final String MODEL = "model";
	/** Qualifier of the <code>Galaxy2.phone</code> attribute **/
	public static final String PHONE = "phone";
	/** Qualifier of the <code>Galaxy2.place</code> attribute **/
	public static final String PLACE = "place";
	/** Qualifier of the <code>Galaxy2.address</code> attribute **/
	public static final String ADDRESS = "address";
	/** Qualifier of the <code>Galaxy2.city</code> attribute **/
	public static final String CITY = "city";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(NO, AttributeMode.INITIAL);
		tmp.put(MODEL, AttributeMode.INITIAL);
		tmp.put(PHONE, AttributeMode.INITIAL);
		tmp.put(PLACE, AttributeMode.INITIAL);
		tmp.put(ADDRESS, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Galaxy2.address</code> attribute.
	 * @return the address
	 */
	public Integer getAddress(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Galaxy2.address</code> attribute.
	 * @return the address
	 */
	public Integer getAddress()
	{
		return getAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Galaxy2.address</code> attribute. 
	 * @return the address
	 */
	public int getAddressAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAddress( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Galaxy2.address</code> attribute. 
	 * @return the address
	 */
	public int getAddressAsPrimitive()
	{
		return getAddressAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Galaxy2.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Galaxy2.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final Integer value)
	{
		setAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Galaxy2.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final SessionContext ctx, final int value)
	{
		setAddress( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Galaxy2.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final int value)
	{
		setAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Galaxy2.city</code> attribute.
	 * @return the city
	 */
	public String getCity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Galaxy2.city</code> attribute.
	 * @return the city
	 */
	public String getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Galaxy2.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Galaxy2.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final String value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Galaxy2.id</code> attribute.
	 * @return the id
	 */
	public Integer getId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Galaxy2.id</code> attribute.
	 * @return the id
	 */
	public Integer getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Galaxy2.id</code> attribute. 
	 * @return the id
	 */
	public int getIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Galaxy2.id</code> attribute. 
	 * @return the id
	 */
	public int getIdAsPrimitive()
	{
		return getIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Galaxy2.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Galaxy2.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final Integer value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Galaxy2.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final int value)
	{
		setId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Galaxy2.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final int value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Galaxy2.model</code> attribute.
	 * @return the model
	 */
	public String getModel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MODEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Galaxy2.model</code> attribute.
	 * @return the model
	 */
	public String getModel()
	{
		return getModel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Galaxy2.model</code> attribute. 
	 * @param value the model
	 */
	public void setModel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MODEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Galaxy2.model</code> attribute. 
	 * @param value the model
	 */
	public void setModel(final String value)
	{
		setModel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Galaxy2.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Galaxy2.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Galaxy2.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Galaxy2.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Galaxy2.no</code> attribute.
	 * @return the no
	 */
	public Integer getNo(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Galaxy2.no</code> attribute.
	 * @return the no
	 */
	public Integer getNo()
	{
		return getNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Galaxy2.no</code> attribute. 
	 * @return the no
	 */
	public int getNoAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNo( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Galaxy2.no</code> attribute. 
	 * @return the no
	 */
	public int getNoAsPrimitive()
	{
		return getNoAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Galaxy2.no</code> attribute. 
	 * @param value the no
	 */
	public void setNo(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Galaxy2.no</code> attribute. 
	 * @param value the no
	 */
	public void setNo(final Integer value)
	{
		setNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Galaxy2.no</code> attribute. 
	 * @param value the no
	 */
	public void setNo(final SessionContext ctx, final int value)
	{
		setNo( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Galaxy2.no</code> attribute. 
	 * @param value the no
	 */
	public void setNo(final int value)
	{
		setNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Galaxy2.phone</code> attribute.
	 * @return the phone
	 */
	public Integer getPhone(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PHONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Galaxy2.phone</code> attribute.
	 * @return the phone
	 */
	public Integer getPhone()
	{
		return getPhone( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Galaxy2.phone</code> attribute. 
	 * @return the phone
	 */
	public int getPhoneAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPhone( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Galaxy2.phone</code> attribute. 
	 * @return the phone
	 */
	public int getPhoneAsPrimitive()
	{
		return getPhoneAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Galaxy2.phone</code> attribute. 
	 * @param value the phone
	 */
	public void setPhone(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PHONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Galaxy2.phone</code> attribute. 
	 * @param value the phone
	 */
	public void setPhone(final Integer value)
	{
		setPhone( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Galaxy2.phone</code> attribute. 
	 * @param value the phone
	 */
	public void setPhone(final SessionContext ctx, final int value)
	{
		setPhone( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Galaxy2.phone</code> attribute. 
	 * @param value the phone
	 */
	public void setPhone(final int value)
	{
		setPhone( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Galaxy2.place</code> attribute.
	 * @return the place
	 */
	public String getPlace(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PLACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Galaxy2.place</code> attribute.
	 * @return the place
	 */
	public String getPlace()
	{
		return getPlace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Galaxy2.place</code> attribute. 
	 * @param value the place
	 */
	public void setPlace(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PLACE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Galaxy2.place</code> attribute. 
	 * @param value the place
	 */
	public void setPlace(final String value)
	{
		setPlace( getSession().getSessionContext(), value );
	}
	
}
