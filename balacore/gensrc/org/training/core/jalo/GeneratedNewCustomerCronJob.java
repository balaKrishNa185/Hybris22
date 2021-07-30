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
 * Generated class for type {@link de.hybris.platform.cronjob.jalo.CronJob NewCustomerCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedNewCustomerCronJob extends CronJob
{
	/** Qualifier of the <code>NewCustomerCronJob.days</code> attribute **/
	public static final String DAYS = "days";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DAYS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewCustomerCronJob.days</code> attribute.
	 * @return the days
	 */
	public Integer getDays(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewCustomerCronJob.days</code> attribute.
	 * @return the days
	 */
	public Integer getDays()
	{
		return getDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewCustomerCronJob.days</code> attribute. 
	 * @return the days
	 */
	public int getDaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDays( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewCustomerCronJob.days</code> attribute. 
	 * @return the days
	 */
	public int getDaysAsPrimitive()
	{
		return getDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewCustomerCronJob.days</code> attribute. 
	 * @param value the days
	 */
	public void setDays(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewCustomerCronJob.days</code> attribute. 
	 * @param value the days
	 */
	public void setDays(final Integer value)
	{
		setDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewCustomerCronJob.days</code> attribute. 
	 * @param value the days
	 */
	public void setDays(final SessionContext ctx, final int value)
	{
		setDays( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewCustomerCronJob.days</code> attribute. 
	 * @param value the days
	 */
	public void setDays(final int value)
	{
		setDays( getSession().getSessionContext(), value );
	}
	
}
