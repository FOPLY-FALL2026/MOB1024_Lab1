package lab1.bai1;

/**
 * Bài 1 – Sản phẩm nhập khẩu, kế thừa Product.
 *
 * TODO:
 *  1. Cho lớp kế thừa Product
 *  2. Thêm thuộc tính private: importTaxRate (double, 0 → 1), shippingFee (double, >= 0)
 *     Getter/Setter: getImportTaxRate/setImportTaxRate, getShippingFee/setShippingFee, có validate
 *  3. Constructor ImportedProduct(String id, String name, double basePrice,
 *                                 double importTaxRate, double shippingFee)
 *     – gọi super(...) ở dòng đầu
 *  4. Override finalPrice() = basePrice + basePrice * importTaxRate + shippingFee
 */
public class ImportedProduct {

}
