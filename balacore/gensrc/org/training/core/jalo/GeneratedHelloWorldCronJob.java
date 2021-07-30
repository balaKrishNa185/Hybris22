/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 18, 2021, 12:47:30 PM                   ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.BalaCoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.cronjob.jalo.CronJob HelloWorldCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedHelloWorldCronJob extends CronJob
{
	/** Qualifier of the <code>HelloWorldCronJob.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>HelloWorldCronJob.place</code> attribute **/
	public static final String PLACE = "place";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(PLACE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HelloWorldCronJob.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HelloWorldCronJob.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HelloWorldCronJob.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HelloWorldCronJob.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HelloWorldCronJob.place</code> attribute.
	 * @return the place
	 */
	public String getPlace(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PLACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HelloWorldCronJob.place</code> attribute.
	 * @return the place
	 */
	public String getPlace()
	{
		return getPlace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HelloWorldCronJob.place</code> attribute. 
	 * @param value the place
	 */
	public void setPlace(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PLACE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HelloWorldCronJob.place</code> attribute. 
	 * @param value the place
	 */
	public void setPlace(final String value)
	{
		setPlace( getSession().getSessionContext(), value );
	}
	
}
