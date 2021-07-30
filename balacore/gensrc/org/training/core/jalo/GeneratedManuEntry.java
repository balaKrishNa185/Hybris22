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
import de.hybris.platform.jalo.c2l.Country;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.BalaCoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ManuEntry}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedManuEntry extends GenericItem
{
	/** Qualifier of the <code>ManuEntry.idEntry</code> attribute **/
	public static final String IDENTRY = "idEntry";
	/** Qualifier of the <code>ManuEntry.nameEntry</code> attribute **/
	public static final String NAMEENTRY = "nameEntry";
	/** Qualifier of the <code>ManuEntry.stateEntry</code> attribute **/
	public static final String STATEENTRY = "stateEntry";
	/** Qualifier of the <code>ManuEntry.countryEntry</code> attribute **/
	public static final String COUNTRYENTRY = "countryEntry";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(IDENTRY, AttributeMode.INITIAL);
		tmp.put(NAMEENTRY, AttributeMode.INITIAL);
		tmp.put(STATEENTRY, AttributeMode.INITIAL);
		tmp.put(COUNTRYENTRY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManuEntry.countryEntry</code> attribute.
	 * @return the countryEntry
	 */
	public Country getCountryEntry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRYENTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManuEntry.countryEntry</code> attribute.
	 * @return the countryEntry
	 */
	public Country getCountryEntry()
	{
		return getCountryEntry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManuEntry.countryEntry</code> attribute. 
	 * @param value the countryEntry
	 */
	public void setCountryEntry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRYENTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManuEntry.countryEntry</code> attribute. 
	 * @param value the countryEntry
	 */
	public void setCountryEntry(final Country value)
	{
		setCountryEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManuEntry.idEntry</code> attribute.
	 * @return the idEntry
	 */
	public Integer getIdEntry(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, IDENTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManuEntry.idEntry</code> attribute.
	 * @return the idEntry
	 */
	public Integer getIdEntry()
	{
		return getIdEntry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManuEntry.idEntry</code> attribute. 
	 * @return the idEntry
	 */
	public int getIdEntryAsPrimitive(final SessionContext ctx)
	{
		Integer value = getIdEntry( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManuEntry.idEntry</code> attribute. 
	 * @return the idEntry
	 */
	public int getIdEntryAsPrimitive()
	{
		return getIdEntryAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManuEntry.idEntry</code> attribute. 
	 * @param value the idEntry
	 */
	public void setIdEntry(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, IDENTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManuEntry.idEntry</code> attribute. 
	 * @param value the idEntry
	 */
	public void setIdEntry(final Integer value)
	{
		setIdEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManuEntry.idEntry</code> attribute. 
	 * @param value the idEntry
	 */
	public void setIdEntry(final SessionContext ctx, final int value)
	{
		setIdEntry( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManuEntry.idEntry</code> attribute. 
	 * @param value the idEntry
	 */
	public void setIdEntry(final int value)
	{
		setIdEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManuEntry.nameEntry</code> attribute.
	 * @return the nameEntry
	 */
	public String getNameEntry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAMEENTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManuEntry.nameEntry</code> attribute.
	 * @return the nameEntry
	 */
	public String getNameEntry()
	{
		return getNameEntry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManuEntry.nameEntry</code> attribute. 
	 * @param value the nameEntry
	 */
	public void setNameEntry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAMEENTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManuEntry.nameEntry</code> attribute. 
	 * @param value the nameEntry
	 */
	public void setNameEntry(final String value)
	{
		setNameEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManuEntry.stateEntry</code> attribute.
	 * @return the stateEntry
	 */
	public String getStateEntry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STATEENTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManuEntry.stateEntry</code> attribute.
	 * @return the stateEntry
	 */
	public String getStateEntry()
	{
		return getStateEntry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManuEntry.stateEntry</code> attribute. 
	 * @param value the stateEntry
	 */
	public void setStateEntry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STATEENTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManuEntry.stateEntry</code> attribute. 
	 * @param value the stateEntry
	 */
	public void setStateEntry(final String value)
	{
		setStateEntry( getSession().getSessionContext(), value );
	}
	
}
