
// run logic --> maybe Main
class CreateService {
    CreatorImp creatorImp;


    public CreateService(CreatorImp creatorImp) {
        this.creatorImp = creatorImp;
    }

    Product productA = this.creatorImp.createProduct("1");
    Product productB = this.creatorImp.createProduct("2");

    // Same obejct different show Feature Method

}

// product
interface Product {
    // different product features
    String showFeature();
}

// Available products
class ProductTypeA implements Product {

    @Override
    public String showFeature() {
        // TODO Auto-generated method stub
        return "A";
    }

}

class ProductTypeB implements Product {

    @Override
    public String showFeature() {
        // TODO Auto-generated method stub
        return "B";
    }

}

// Creation Factory
interface Creator {
    Product createProduct(String key);
}

class CreatorImp implements Creator {

    ProductTypeB productTypeB;
    ProductTypeA productTypeA;

    @Override
    public Product createProduct(String key) {
        if (key == "1") {
            return new ProductTypeA();
        } else {
            return new ProductTypeB();
        }
    }

}