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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Teacher}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTeacher extends GenericItem
{
	/** Qualifier of the <code>Teacher.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Teacher.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Teacher.degree</code> attribute **/
	public static final String DEGREE = "degree";
	/** Qualifier of the <code>Teacher.phone</code> attribute **/
	public static final String PHONE = "phone";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(DEGREE, AttributeMode.INITIAL);
		tmp.put(PHONE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.degree</code> attribute.
	 * @return the degree
	 */
	public String getDegree(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DEGREE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.degree</code> attribute.
	 * @return the degree
	 */
	public String getDegree()
	{
		return getDegree( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.degree</code> attribute. 
	 * @param value the degree
	 */
	public void setDegree(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DEGREE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.degree</code> attribute. 
	 * @param value the degree
	 */
	public void setDegree(final String value)
	{
		setDegree( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.id</code> attribute.
	 * @return the id
	 */
	public Integer getId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.id</code> attribute.
	 * @return the id
	 */
	public Integer getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.id</code> attribute. 
	 * @return the id
	 */
	public int getIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.id</code> attribute. 
	 * @return the id
	 */
	public int getIdAsPrimitive()
	{
		return getIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final Integer value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final int value)
	{
		setId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final int value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.phone</code> attribute.
	 * @return the phone
	 */
	public Long getPhone(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, PHONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.phone</code> attribute.
	 * @return the phone
	 */
	public Long getPhone()
	{
		return getPhone( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.phone</code> attribute. 
	 * @return the phone
	 */
	public long getPhoneAsPrimitive(final SessionContext ctx)
	{
		Long value = getPhone( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.phone</code> attribute. 
	 * @return the phone
	 */
	public long getPhoneAsPrimitive()
	{
		return getPhoneAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.phone</code> attribute. 
	 * @param value the phone
	 */
	public void setPhone(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, PHONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.phone</code> attribute. 
	 * @param value the phone
	 */
	public void setPhone(final Long value)
	{
		setPhone( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.phone</code> attribute. 
	 * @param value the phone
	 */
	public void setPhone(final SessionContext ctx, final long value)
	{
		setPhone( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.phone</code> attribute. 
	 * @param value the phone
	 */
	public void setPhone(final long value)
	{
		setPhone( getSession().getSessionContext(), value );
	}
	
}
