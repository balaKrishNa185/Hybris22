/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 18, 2021, 12:47:30 PM                   ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.training.core.constants.BalaCoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Accounts}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedAccounts extends GenericItem
{
	/** Qualifier of the <code>Accounts.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Accounts.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Accounts.nation</code> attribute **/
	public static final String NATION = "nation";
	/** Qualifier of the <code>Accounts.ball</code> attribute **/
	public static final String BALL = "ball";
	/** Qualifier of the <code>Accounts.place</code> attribute **/
	public static final String PLACE = "place";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(NATION, AttributeMode.INITIAL);
		tmp.put(BALL, AttributeMode.INITIAL);
		tmp.put(PLACE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accounts.ball</code> attribute.
	 * @return the ball
	 */
	public EnumerationValue getBall(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, BALL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accounts.ball</code> attribute.
	 * @return the ball
	 */
	public EnumerationValue getBall()
	{
		return getBall( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accounts.ball</code> attribute. 
	 * @param value the ball
	 */
	public void setBall(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, BALL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accounts.ball</code> attribute. 
	 * @param value the ball
	 */
	public void setBall(final EnumerationValue value)
	{
		setBall( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accounts.id</code> attribute.
	 * @return the id
	 */
	public Integer getId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accounts.id</code> attribute.
	 * @return the id
	 */
	public Integer getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accounts.id</code> attribute. 
	 * @return the id
	 */
	public int getIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accounts.id</code> attribute. 
	 * @return the id
	 */
	public int getIdAsPrimitive()
	{
		return getIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accounts.id</code> attribute. 
	 * @param value the id
	 */
	protected void setId(final SessionContext ctx, final Integer value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+ID+"' is not changeable", 0 );
		}
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accounts.id</code> attribute. 
	 * @param value the id
	 */
	protected void setId(final Integer value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accounts.id</code> attribute. 
	 * @param value the id
	 */
	protected void setId(final SessionContext ctx, final int value)
	{
		setId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accounts.id</code> attribute. 
	 * @param value the id
	 */
	protected void setId(final int value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accounts.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAccounts.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accounts.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accounts.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accounts.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accounts.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAccounts.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accounts.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accounts.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accounts.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accounts.nation</code> attribute.
	 * @return the nation
	 */
	public List<EnumerationValue> getNation(final SessionContext ctx)
	{
		List<EnumerationValue> coll = (List<EnumerationValue>)getProperty( ctx, NATION);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accounts.nation</code> attribute.
	 * @return the nation
	 */
	public List<EnumerationValue> getNation()
	{
		return getNation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accounts.nation</code> attribute. 
	 * @param value the nation
	 */
	public void setNation(final SessionContext ctx, final List<EnumerationValue> value)
	{
		setProperty(ctx, NATION,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accounts.nation</code> attribute. 
	 * @param value the nation
	 */
	public void setNation(final List<EnumerationValue> value)
	{
		setNation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accounts.place</code> attribute.
	 * @return the place
	 */
	public String getPlace(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PLACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accounts.place</code> attribute.
	 * @return the place
	 */
	public String getPlace()
	{
		return getPlace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accounts.place</code> attribute. 
	 * @param value the place
	 */
	public void setPlace(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PLACE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accounts.place</code> attribute. 
	 * @param value the place
	 */
	public void setPlace(final String value)
	{
		setPlace( getSession().getSessionContext(), value );
	}
	
}
