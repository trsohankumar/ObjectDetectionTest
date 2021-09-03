package com.eazyalgo.objectdetectiontest

class Products {
    companion object{
        fun defaultProductsList():ArrayList<SimilarProduct>{
            val productsList = ArrayList<SimilarProduct>()
            val product1 = SimilarProduct(1,"Heinz Tomato Ketchup",1,"$59.80")
            productsList.add(product1)
            productsList.add(product1)
            productsList.add(product1)
            productsList.add(product1)
            productsList.add(product1)


            return productsList
        }
    }
}