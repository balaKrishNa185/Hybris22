package org.training.core.PracticeDAO;

import de.hybris.platform.core.model.product.ProductModel;

import java.util.List;

public interface CustomProductDao {

    List<ProductModel> getAllProducts(int noofLatest);
}
