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
 * Generated class for type {@link de.hybris.platform.cronjob.jalo.CronJob CustomerDescriptionCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCustomerDescriptionCronJob extends CronJob
{
	/** Qualifier of the <code>CustomerDescriptionCronJob.nullOrNotNull</code> attribute **/
	public static final String NULLORNOTNULL = "nullOrNotNull";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NULLORNOTNULL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerDescriptionCronJob.nullOrNotNull</code> attribute.
	 * @return the nullOrNotNull
	 */
	public String getNullOrNotNull(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NULLORNOTNULL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomerDescriptionCronJob.nullOrNotNull</code> attribute.
	 * @return the nullOrNotNull
	 */
	public String getNullOrNotNull()
	{
		return getNullOrNotNull( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerDescriptionCronJob.nullOrNotNull</code> attribute. 
	 * @param value the nullOrNotNull
	 */
	public void setNullOrNotNull(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NULLORNOTNULL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomerDescriptionCronJob.nullOrNotNull</code> attribute. 
	 * @param value the nullOrNotNull
	 */
	public void setNullOrNotNull(final String value)
	{
		setNullOrNotNull( getSession().getSessionContext(), value );
	}
	
}
