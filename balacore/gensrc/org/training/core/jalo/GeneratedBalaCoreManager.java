/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 18, 2021, 12:47:30 PM                   ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.ConsistencyCheckException;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.security.PrincipalGroup;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.jalo.user.UserGroup;
import de.hybris.platform.solrfacetsearch.jalo.config.SolrFacetSearchConfig;
import de.hybris.platform.util.PartOfHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.training.core.constants.BalaCoreConstants;
import org.training.core.jalo.Accounts;
import org.training.core.jalo.ApparelProduct;
import org.training.core.jalo.ApparelSizeVariantProduct;
import org.training.core.jalo.ApparelStyleVariantProduct;
import org.training.core.jalo.College;
import org.training.core.jalo.CustomerDescriptionCronJob;
import org.training.core.jalo.Customers;
import org.training.core.jalo.CustomersRemovalCronJob;
import org.training.core.jalo.DisplayComponent;
import org.training.core.jalo.ElectronicsColorVariantProduct;
import org.training.core.jalo.Galaxy2;
import org.training.core.jalo.HelloWorldCronJob;
import org.training.core.jalo.Jeep;
import org.training.core.jalo.LatestProductsComponent;
import org.training.core.jalo.ManuEntry;
import org.training.core.jalo.Manufacturer;
import org.training.core.jalo.NewCustomerCronJob;
import org.training.core.jalo.Player;
import org.training.core.jalo.Sam;
import org.training.core.jalo.Sam1;
import org.training.core.jalo.Ship;
import org.training.core.jalo.StuEntry;
import org.training.core.jalo.Student;
import org.training.core.jalo.Teacher;
import org.training.core.jalo.TestCronJob;
import org.training.core.jalo.TestingComponent1;
import org.training.core.jalo.TrainingComponent1;

/**
 * Generated class for type <code>BalaCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedBalaCoreManager extends Extension
{
	/** Relation ordering override parameter constants for Manu2Product from ((balacore))*/
	protected static String MANU2PRODUCT_SRC_ORDERED = "relation.Manu2Product.source.ordered";
	protected static String MANU2PRODUCT_TGT_ORDERED = "relation.Manu2Product.target.ordered";
	/** Relation disable markmodifed parameter constants for Manu2Product from ((balacore))*/
	protected static String MANU2PRODUCT_MARKMODIFIED = "relation.Manu2Product.markmodified";
	/** Relation ordering override parameter constants for Player2Product from ((balacore))*/
	protected static String PLAYER2PRODUCT_SRC_ORDERED = "relation.Player2Product.source.ordered";
	protected static String PLAYER2PRODUCT_TGT_ORDERED = "relation.Player2Product.target.ordered";
	/** Relation disable markmodifed parameter constants for Player2Product from ((balacore))*/
	protected static String PLAYER2PRODUCT_MARKMODIFIED = "relation.Player2Product.markmodified";
	/** Relation ordering override parameter constants for Solr2user from ((balacore))*/
	protected static String SOLR2USER_SRC_ORDERED = "relation.Solr2user.source.ordered";
	protected static String SOLR2USER_TGT_ORDERED = "relation.Solr2user.target.ordered";
	/** Relation disable markmodifed parameter constants for Solr2user from ((balacore))*/
	protected static String SOLR2USER_MARKMODIFIED = "relation.Solr2user.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("isNew", AttributeMode.INITIAL);
		tmp.put("place", AttributeMode.INITIAL);
		tmp.put("newBusinessUser", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("isTesting", AttributeMode.INITIAL);
		tmp.put("isCount", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public Accounts createAccounts(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.ACCOUNTS );
			return (Accounts)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Accounts : "+e.getMessage(), 0 );
		}
	}
	
	public Accounts createAccounts(final Map attributeValues)
	{
		return createAccounts( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public College createCollege(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.COLLEGE );
			return (College)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating College : "+e.getMessage(), 0 );
		}
	}
	
	public College createCollege(final Map attributeValues)
	{
		return createCollege( getSession().getSessionContext(), attributeValues );
	}
	
	public CustomerDescriptionCronJob createCustomerDescriptionCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.CUSTOMERDESCRIPTIONCRONJOB );
			return (CustomerDescriptionCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CustomerDescriptionCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public CustomerDescriptionCronJob createCustomerDescriptionCronJob(final Map attributeValues)
	{
		return createCustomerDescriptionCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public Customers createCustomers(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.CUSTOMERS );
			return (Customers)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Customers : "+e.getMessage(), 0 );
		}
	}
	
	public Customers createCustomers(final Map attributeValues)
	{
		return createCustomers( getSession().getSessionContext(), attributeValues );
	}
	
	public CustomersRemovalCronJob createCustomersRemovalCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.CUSTOMERSREMOVALCRONJOB );
			return (CustomersRemovalCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CustomersRemovalCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public CustomersRemovalCronJob createCustomersRemovalCronJob(final Map attributeValues)
	{
		return createCustomersRemovalCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public DisplayComponent createDisplayComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.DISPLAYCOMPONENT );
			return (DisplayComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating DisplayComponent : "+e.getMessage(), 0 );
		}
	}
	
	public DisplayComponent createDisplayComponent(final Map attributeValues)
	{
		return createDisplayComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public Galaxy2 createGalaxy2(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.GALAXY2 );
			return (Galaxy2)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Galaxy2 : "+e.getMessage(), 0 );
		}
	}
	
	public Galaxy2 createGalaxy2(final Map attributeValues)
	{
		return createGalaxy2( getSession().getSessionContext(), attributeValues );
	}
	
	public HelloWorldCronJob createHelloWorldCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.HELLOWORLDCRONJOB );
			return (HelloWorldCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating HelloWorldCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public HelloWorldCronJob createHelloWorldCronJob(final Map attributeValues)
	{
		return createHelloWorldCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public Jeep createJeep(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.JEEP );
			return (Jeep)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Jeep : "+e.getMessage(), 0 );
		}
	}
	
	public Jeep createJeep(final Map attributeValues)
	{
		return createJeep( getSession().getSessionContext(), attributeValues );
	}
	
	public LatestProductsComponent createLatestProductsComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.LATESTPRODUCTSCOMPONENT );
			return (LatestProductsComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating LatestProductsComponent : "+e.getMessage(), 0 );
		}
	}
	
	public LatestProductsComponent createLatestProductsComponent(final Map attributeValues)
	{
		return createLatestProductsComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ManuEntry createManuEntry(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.MANUENTRY );
			return (ManuEntry)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ManuEntry : "+e.getMessage(), 0 );
		}
	}
	
	public ManuEntry createManuEntry(final Map attributeValues)
	{
		return createManuEntry( getSession().getSessionContext(), attributeValues );
	}
	
	public Manufacturer createManufacturer(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.MANUFACTURER );
			return (Manufacturer)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Manufacturer : "+e.getMessage(), 0 );
		}
	}
	
	public Manufacturer createManufacturer(final Map attributeValues)
	{
		return createManufacturer( getSession().getSessionContext(), attributeValues );
	}
	
	public NewCustomerCronJob createNewCustomerCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.NEWCUSTOMERCRONJOB );
			return (NewCustomerCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating NewCustomerCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public NewCustomerCronJob createNewCustomerCronJob(final Map attributeValues)
	{
		return createNewCustomerCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public Player createPlayer(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.PLAYER );
			return (Player)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Player : "+e.getMessage(), 0 );
		}
	}
	
	public Player createPlayer(final Map attributeValues)
	{
		return createPlayer( getSession().getSessionContext(), attributeValues );
	}
	
	public Sam createSam(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.SAM );
			return (Sam)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Sam : "+e.getMessage(), 0 );
		}
	}
	
	public Sam createSam(final Map attributeValues)
	{
		return createSam( getSession().getSessionContext(), attributeValues );
	}
	
	public Sam1 createSam1(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.SAM1 );
			return (Sam1)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Sam1 : "+e.getMessage(), 0 );
		}
	}
	
	public Sam1 createSam1(final Map attributeValues)
	{
		return createSam1( getSession().getSessionContext(), attributeValues );
	}
	
	public Ship createShip(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.SHIP );
			return (Ship)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Ship : "+e.getMessage(), 0 );
		}
	}
	
	public Ship createShip(final Map attributeValues)
	{
		return createShip( getSession().getSessionContext(), attributeValues );
	}
	
	public Student createStudent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.STUDENT );
			return (Student)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Student : "+e.getMessage(), 0 );
		}
	}
	
	public Student createStudent(final Map attributeValues)
	{
		return createStudent( getSession().getSessionContext(), attributeValues );
	}
	
	public StuEntry createStuEntry(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.STUENTRY );
			return (StuEntry)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating StuEntry : "+e.getMessage(), 0 );
		}
	}
	
	public StuEntry createStuEntry(final Map attributeValues)
	{
		return createStuEntry( getSession().getSessionContext(), attributeValues );
	}
	
	public Teacher createTeacher(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.TEACHER );
			return (Teacher)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Teacher : "+e.getMessage(), 0 );
		}
	}
	
	public Teacher createTeacher(final Map attributeValues)
	{
		return createTeacher( getSession().getSessionContext(), attributeValues );
	}
	
	public TestCronJob createTestCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.TESTCRONJOB );
			return (TestCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating TestCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public TestCronJob createTestCronJob(final Map attributeValues)
	{
		return createTestCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public TestingComponent1 createTestingComponent1(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.TESTINGCOMPONENT1 );
			return (TestingComponent1)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating TestingComponent1 : "+e.getMessage(), 0 );
		}
	}
	
	public TestingComponent1 createTestingComponent1(final Map attributeValues)
	{
		return createTestingComponent1( getSession().getSessionContext(), attributeValues );
	}
	
	public GenericItem createThar(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.THAR );
			return (GenericItem)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Thar : "+e.getMessage(), 0 );
		}
	}
	
	public GenericItem createThar(final Map attributeValues)
	{
		return createThar( getSession().getSessionContext(), attributeValues );
	}
	
	public TrainingComponent1 createTrainingComponent1(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BalaCoreConstants.TC.TRAININGCOMPONENT1 );
			return (TrainingComponent1)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating TrainingComponent1 : "+e.getMessage(), 0 );
		}
	}
	
	public TrainingComponent1 createTrainingComponent1(final Map attributeValues)
	{
		return createTrainingComponent1( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.customUserGroup</code> attribute.
	 * @return the customUserGroup
	 */
	public List<UserGroup> getCustomUserGroup(final SessionContext ctx, final SolrFacetSearchConfig item)
	{
		final List<UserGroup> items = item.getLinkedItems( 
			ctx,
			true,
			BalaCoreConstants.Relations.SOLR2USER,
			"UserGroup",
			null,
			Utilities.getRelationOrderingOverride(SOLR2USER_SRC_ORDERED, true),
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolrFacetSearchConfig.customUserGroup</code> attribute.
	 * @return the customUserGroup
	 */
	public List<UserGroup> getCustomUserGroup(final SolrFacetSearchConfig item)
	{
		return getCustomUserGroup( getSession().getSessionContext(), item );
	}
	
	public long getCustomUserGroupCount(final SessionContext ctx, final SolrFacetSearchConfig item)
	{
		return item.getLinkedItemsCount(
			ctx,
			true,
			BalaCoreConstants.Relations.SOLR2USER,
			"UserGroup",
			null
		);
	}
	
	public long getCustomUserGroupCount(final SolrFacetSearchConfig item)
	{
		return getCustomUserGroupCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SolrFacetSearchConfig.customUserGroup</code> attribute. 
	 * @param value the customUserGroup
	 */
	public void setCustomUserGroup(final SessionContext ctx, final SolrFacetSearchConfig item, final List<UserGroup> value)
	{
		item.setLinkedItems( 
			ctx,
			true,
			BalaCoreConstants.Relations.SOLR2USER,
			null,
			value,
			Utilities.getRelationOrderingOverride(SOLR2USER_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(SOLR2USER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SolrFacetSearchConfig.customUserGroup</code> attribute. 
	 * @param value the customUserGroup
	 */
	public void setCustomUserGroup(final SolrFacetSearchConfig item, final List<UserGroup> value)
	{
		setCustomUserGroup( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to customUserGroup. 
	 * @param value the item to add to customUserGroup
	 */
	public void addToCustomUserGroup(final SessionContext ctx, final SolrFacetSearchConfig item, final UserGroup value)
	{
		item.addLinkedItems( 
			ctx,
			true,
			BalaCoreConstants.Relations.SOLR2USER,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(SOLR2USER_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(SOLR2USER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to customUserGroup. 
	 * @param value the item to add to customUserGroup
	 */
	public void addToCustomUserGroup(final SolrFacetSearchConfig item, final UserGroup value)
	{
		addToCustomUserGroup( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from customUserGroup. 
	 * @param value the item to remove from customUserGroup
	 */
	public void removeFromCustomUserGroup(final SessionContext ctx, final SolrFacetSearchConfig item, final UserGroup value)
	{
		item.removeLinkedItems( 
			ctx,
			true,
			BalaCoreConstants.Relations.SOLR2USER,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(SOLR2USER_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(SOLR2USER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from customUserGroup. 
	 * @param value the item to remove from customUserGroup
	 */
	public void removeFromCustomUserGroup(final SolrFacetSearchConfig item, final UserGroup value)
	{
		removeFromCustomUserGroup( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return BalaCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isCount</code> attribute.
	 * @return the isCount
	 */
	public Integer getIsCount(final SessionContext ctx, final Product item)
	{
		return (Integer)item.getProperty( ctx, BalaCoreConstants.Attributes.Product.ISCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isCount</code> attribute.
	 * @return the isCount
	 */
	public Integer getIsCount(final Product item)
	{
		return getIsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isCount</code> attribute. 
	 * @return the isCount
	 */
	public int getIsCountAsPrimitive(final SessionContext ctx, final Product item)
	{
		Integer value = getIsCount( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isCount</code> attribute. 
	 * @return the isCount
	 */
	public int getIsCountAsPrimitive(final Product item)
	{
		return getIsCountAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isCount</code> attribute. 
	 * @param value the isCount
	 */
	public void setIsCount(final SessionContext ctx, final Product item, final Integer value)
	{
		item.setProperty(ctx, BalaCoreConstants.Attributes.Product.ISCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isCount</code> attribute. 
	 * @param value the isCount
	 */
	public void setIsCount(final Product item, final Integer value)
	{
		setIsCount( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isCount</code> attribute. 
	 * @param value the isCount
	 */
	public void setIsCount(final SessionContext ctx, final Product item, final int value)
	{
		setIsCount( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isCount</code> attribute. 
	 * @param value the isCount
	 */
	public void setIsCount(final Product item, final int value)
	{
		setIsCount( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNew</code> attribute.
	 * @return the isNew
	 */
	public Boolean isIsNew(final SessionContext ctx, final Customer item)
	{
		return (Boolean)item.getProperty( ctx, BalaCoreConstants.Attributes.Customer.ISNEW);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNew</code> attribute.
	 * @return the isNew
	 */
	public Boolean isIsNew(final Customer item)
	{
		return isIsNew( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNew</code> attribute. 
	 * @return the isNew
	 */
	public boolean isIsNewAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Boolean value = isIsNew( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNew</code> attribute. 
	 * @return the isNew
	 */
	public boolean isIsNewAsPrimitive(final Customer item)
	{
		return isIsNewAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNew</code> attribute. 
	 * @param value the isNew
	 */
	public void setIsNew(final SessionContext ctx, final Customer item, final Boolean value)
	{
		item.setProperty(ctx, BalaCoreConstants.Attributes.Customer.ISNEW,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNew</code> attribute. 
	 * @param value the isNew
	 */
	public void setIsNew(final Customer item, final Boolean value)
	{
		setIsNew( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNew</code> attribute. 
	 * @param value the isNew
	 */
	public void setIsNew(final SessionContext ctx, final Customer item, final boolean value)
	{
		setIsNew( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNew</code> attribute. 
	 * @param value the isNew
	 */
	public void setIsNew(final Customer item, final boolean value)
	{
		setIsNew( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isTesting</code> attribute.
	 * @return the isTesting
	 */
	public String getIsTesting(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, BalaCoreConstants.Attributes.Product.ISTESTING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isTesting</code> attribute.
	 * @return the isTesting
	 */
	public String getIsTesting(final Product item)
	{
		return getIsTesting( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isTesting</code> attribute. 
	 * @param value the isTesting
	 */
	public void setIsTesting(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, BalaCoreConstants.Attributes.Product.ISTESTING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isTesting</code> attribute. 
	 * @param value the isTesting
	 */
	public void setIsTesting(final Product item, final String value)
	{
		setIsTesting( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.manufacturers</code> attribute.
	 * @return the manufacturers
	 */
	public List<Manufacturer> getManufacturers(final SessionContext ctx, final Product item)
	{
		final List<Manufacturer> items = item.getLinkedItems( 
			ctx,
			false,
			BalaCoreConstants.Relations.MANU2PRODUCT,
			"Manufacturer",
			null,
			Utilities.getRelationOrderingOverride(MANU2PRODUCT_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(MANU2PRODUCT_TGT_ORDERED, true)
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.manufacturers</code> attribute.
	 * @return the manufacturers
	 */
	public List<Manufacturer> getManufacturers(final Product item)
	{
		return getManufacturers( getSession().getSessionContext(), item );
	}
	
	public long getManufacturersCount(final SessionContext ctx, final Product item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			BalaCoreConstants.Relations.MANU2PRODUCT,
			"Manufacturer",
			null
		);
	}
	
	public long getManufacturersCount(final Product item)
	{
		return getManufacturersCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.manufacturers</code> attribute. 
	 * @param value the manufacturers
	 */
	public void setManufacturers(final SessionContext ctx, final Product item, final List<Manufacturer> value)
	{
		new PartOfHandler<List<Manufacturer>>()
		{
			@Override
			protected List<Manufacturer> doGetValue(final SessionContext ctx)
			{
				return getManufacturers( ctx, item );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final List<Manufacturer> _value)
			{
				final List<Manufacturer> value = _value;
				item.setLinkedItems( 
					ctx,
					false,
					BalaCoreConstants.Relations.MANU2PRODUCT,
					null,
					value,
					Utilities.getRelationOrderingOverride(MANU2PRODUCT_SRC_ORDERED, true),
					Utilities.getRelationOrderingOverride(MANU2PRODUCT_TGT_ORDERED, true),
					Utilities.getMarkModifiedOverride(MANU2PRODUCT_MARKMODIFIED)
				);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.manufacturers</code> attribute. 
	 * @param value the manufacturers
	 */
	public void setManufacturers(final Product item, final List<Manufacturer> value)
	{
		setManufacturers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to manufacturers. 
	 * @param value the item to add to manufacturers
	 */
	public void addToManufacturers(final SessionContext ctx, final Product item, final Manufacturer value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			BalaCoreConstants.Relations.MANU2PRODUCT,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(MANU2PRODUCT_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(MANU2PRODUCT_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(MANU2PRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to manufacturers. 
	 * @param value the item to add to manufacturers
	 */
	public void addToManufacturers(final Product item, final Manufacturer value)
	{
		addToManufacturers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from manufacturers. 
	 * @param value the item to remove from manufacturers
	 */
	public void removeFromManufacturers(final SessionContext ctx, final Product item, final Manufacturer value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			BalaCoreConstants.Relations.MANU2PRODUCT,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(MANU2PRODUCT_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(MANU2PRODUCT_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(MANU2PRODUCT_MARKMODIFIED)
		);
		if( !item.getLinkedItems( ctx, false,BalaCoreConstants.Relations.MANU2PRODUCT,null).contains( value ) )
		{
			try
			{
				value.remove( ctx );
			}
			catch( ConsistencyCheckException e )
			{
				throw new JaloSystemException(e);
			}
		}
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from manufacturers. 
	 * @param value the item to remove from manufacturers
	 */
	public void removeFromManufacturers(final Product item, final Manufacturer value)
	{
		removeFromManufacturers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.newBusinessUser</code> attribute.
	 * @return the newBusinessUser
	 */
	public Boolean isNewBusinessUser(final SessionContext ctx, final Customer item)
	{
		return (Boolean)item.getProperty( ctx, BalaCoreConstants.Attributes.Customer.NEWBUSINESSUSER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.newBusinessUser</code> attribute.
	 * @return the newBusinessUser
	 */
	public Boolean isNewBusinessUser(final Customer item)
	{
		return isNewBusinessUser( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.newBusinessUser</code> attribute. 
	 * @return the newBusinessUser
	 */
	public boolean isNewBusinessUserAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Boolean value = isNewBusinessUser( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.newBusinessUser</code> attribute. 
	 * @return the newBusinessUser
	 */
	public boolean isNewBusinessUserAsPrimitive(final Customer item)
	{
		return isNewBusinessUserAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.newBusinessUser</code> attribute. 
	 * @param value the newBusinessUser
	 */
	public void setNewBusinessUser(final SessionContext ctx, final Customer item, final Boolean value)
	{
		item.setProperty(ctx, BalaCoreConstants.Attributes.Customer.NEWBUSINESSUSER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.newBusinessUser</code> attribute. 
	 * @param value the newBusinessUser
	 */
	public void setNewBusinessUser(final Customer item, final Boolean value)
	{
		setNewBusinessUser( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.newBusinessUser</code> attribute. 
	 * @param value the newBusinessUser
	 */
	public void setNewBusinessUser(final SessionContext ctx, final Customer item, final boolean value)
	{
		setNewBusinessUser( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.newBusinessUser</code> attribute. 
	 * @param value the newBusinessUser
	 */
	public void setNewBusinessUser(final Customer item, final boolean value)
	{
		setNewBusinessUser( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.place</code> attribute.
	 * @return the place
	 */
	public String getPlace(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, BalaCoreConstants.Attributes.Customer.PLACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.place</code> attribute.
	 * @return the place
	 */
	public String getPlace(final Customer item)
	{
		return getPlace( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.place</code> attribute. 
	 * @param value the place
	 */
	public void setPlace(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, BalaCoreConstants.Attributes.Customer.PLACE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.place</code> attribute. 
	 * @param value the place
	 */
	public void setPlace(final Customer item, final String value)
	{
		setPlace( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.players</code> attribute.
	 * @return the players
	 */
	public Collection<Player> getPlayers(final SessionContext ctx, final Product item)
	{
		final List<Player> items = item.getLinkedItems( 
			ctx,
			false,
			BalaCoreConstants.Relations.PLAYER2PRODUCT,
			"Player",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.players</code> attribute.
	 * @return the players
	 */
	public Collection<Player> getPlayers(final Product item)
	{
		return getPlayers( getSession().getSessionContext(), item );
	}
	
	public long getPlayersCount(final SessionContext ctx, final Product item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			BalaCoreConstants.Relations.PLAYER2PRODUCT,
			"Player",
			null
		);
	}
	
	public long getPlayersCount(final Product item)
	{
		return getPlayersCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.players</code> attribute. 
	 * @param value the players
	 */
	public void setPlayers(final SessionContext ctx, final Product item, final Collection<Player> value)
	{
		new PartOfHandler<Collection<Player>>()
		{
			@Override
			protected Collection<Player> doGetValue(final SessionContext ctx)
			{
				return getPlayers( ctx, item );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final Collection<Player> _value)
			{
				final Collection<Player> value = _value;
				item.setLinkedItems( 
					ctx,
					false,
					BalaCoreConstants.Relations.PLAYER2PRODUCT,
					null,
					value,
					false,
					false,
					Utilities.getMarkModifiedOverride(PLAYER2PRODUCT_MARKMODIFIED)
				);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.players</code> attribute. 
	 * @param value the players
	 */
	public void setPlayers(final Product item, final Collection<Player> value)
	{
		setPlayers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to players. 
	 * @param value the item to add to players
	 */
	public void addToPlayers(final SessionContext ctx, final Product item, final Player value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			BalaCoreConstants.Relations.PLAYER2PRODUCT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(PLAYER2PRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to players. 
	 * @param value the item to add to players
	 */
	public void addToPlayers(final Product item, final Player value)
	{
		addToPlayers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from players. 
	 * @param value the item to remove from players
	 */
	public void removeFromPlayers(final SessionContext ctx, final Product item, final Player value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			BalaCoreConstants.Relations.PLAYER2PRODUCT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(PLAYER2PRODUCT_MARKMODIFIED)
		);
		if( !item.getLinkedItems( ctx, false,BalaCoreConstants.Relations.PLAYER2PRODUCT,null).contains( value ) )
		{
			try
			{
				value.remove( ctx );
			}
			catch( ConsistencyCheckException e )
			{
				throw new JaloSystemException(e);
			}
		}
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from players. 
	 * @param value the item to remove from players
	 */
	public void removeFromPlayers(final Product item, final Player value)
	{
		removeFromPlayers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserGroup.solrFacetSearchConfig</code> attribute.
	 * @return the solrFacetSearchConfig
	 */
	public List<SolrFacetSearchConfig> getSolrFacetSearchConfig(final SessionContext ctx, final UserGroup item)
	{
		final List<SolrFacetSearchConfig> items = item.getLinkedItems( 
			ctx,
			false,
			BalaCoreConstants.Relations.SOLR2USER,
			"SolrFacetSearchConfig",
			null,
			Utilities.getRelationOrderingOverride(SOLR2USER_SRC_ORDERED, true),
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserGroup.solrFacetSearchConfig</code> attribute.
	 * @return the solrFacetSearchConfig
	 */
	public List<SolrFacetSearchConfig> getSolrFacetSearchConfig(final UserGroup item)
	{
		return getSolrFacetSearchConfig( getSession().getSessionContext(), item );
	}
	
	public long getSolrFacetSearchConfigCount(final SessionContext ctx, final UserGroup item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			BalaCoreConstants.Relations.SOLR2USER,
			"SolrFacetSearchConfig",
			null
		);
	}
	
	public long getSolrFacetSearchConfigCount(final UserGroup item)
	{
		return getSolrFacetSearchConfigCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserGroup.solrFacetSearchConfig</code> attribute. 
	 * @param value the solrFacetSearchConfig
	 */
	public void setSolrFacetSearchConfig(final SessionContext ctx, final UserGroup item, final List<SolrFacetSearchConfig> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			BalaCoreConstants.Relations.SOLR2USER,
			null,
			value,
			Utilities.getRelationOrderingOverride(SOLR2USER_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(SOLR2USER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserGroup.solrFacetSearchConfig</code> attribute. 
	 * @param value the solrFacetSearchConfig
	 */
	public void setSolrFacetSearchConfig(final UserGroup item, final List<SolrFacetSearchConfig> value)
	{
		setSolrFacetSearchConfig( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to solrFacetSearchConfig. 
	 * @param value the item to add to solrFacetSearchConfig
	 */
	public void addToSolrFacetSearchConfig(final SessionContext ctx, final UserGroup item, final SolrFacetSearchConfig value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			BalaCoreConstants.Relations.SOLR2USER,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(SOLR2USER_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(SOLR2USER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to solrFacetSearchConfig. 
	 * @param value the item to add to solrFacetSearchConfig
	 */
	public void addToSolrFacetSearchConfig(final UserGroup item, final SolrFacetSearchConfig value)
	{
		addToSolrFacetSearchConfig( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from solrFacetSearchConfig. 
	 * @param value the item to remove from solrFacetSearchConfig
	 */
	public void removeFromSolrFacetSearchConfig(final SessionContext ctx, final UserGroup item, final SolrFacetSearchConfig value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			BalaCoreConstants.Relations.SOLR2USER,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(SOLR2USER_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(SOLR2USER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from solrFacetSearchConfig. 
	 * @param value the item to remove from solrFacetSearchConfig
	 */
	public void removeFromSolrFacetSearchConfig(final UserGroup item, final SolrFacetSearchConfig value)
	{
		removeFromSolrFacetSearchConfig( getSession().getSessionContext(), item, value );
	}
	
}
