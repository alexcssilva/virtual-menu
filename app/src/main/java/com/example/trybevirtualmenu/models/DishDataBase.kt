package com.example.trybevirtualmenu.models

import com.example.trybevirtualmenu.R

object DishDataBase {
    private const val BEEF_FRIES_ID = 1
    private const val GRILLED_CHICKEN_ID = 2
    private const val MIXED_GRILL_ID = 3
    private const val PICANHA_ID = 4
    private const val FRENCH_FRIES_ID = 5
    private const val ORANGE_JUICE_ID = 6

    private const val BEEF_FRIES_PRICE = 65.00
    private const val GRILLED_CHICKEN_PRICE = 45.00
    private const val MIXED_GRILL_PRICE = 85.00
    private const val PICANHA_PRICE = 85.00
    private const val FRENCH_FRIES_PRICE = 20.00
    private const val ORANGE_JUICE_PRICE = 10.00

    private val dishes = listOf(
        Dish(
            BEEF_FRIES_ID,
            "File de Carne com Fritas",
            R.drawable.prato_01,
            "Uma suculenta porção de filé de carne grelhado na perfeição, servido " +
                    "com deliciosas batatas fritas crocantes. Uma explosão de sabor que vai " +
                    "satisfazer seus desejos mais carnívoros.",
            BEEF_FRIES_PRICE
        ),
        Dish(
            GRILLED_CHICKEN_ID,
            "Frango Grelhado com Legumes",
            R.drawable.prato_02,
            "Uma opção saudável e saborosa: peitos de frango suculentos grelhados " +
                    "à perfeição, acompanhados de legumes frescos, preparados para manter " +
                    "a crocância e o sabor. Uma refeição leve e deliciosa para quem busca " +
                    "um toque de frescor.",
            GRILLED_CHICKEN_PRICE
        ),
        Dish(
            MIXED_GRILL_ID,
            "Mix de File de Carne e Frango Grelhados",
            R.drawable.prato_03,
            "A melhor escolha para os indecisos! Uma combinação harmoniosa de" +
                    " filé de carne suculento e peito de frango grelhado, oferecendo uma " +
                    "explosão de sabores em cada garfada. Acompanhado de opções de molhos" +
                    " que tornam essa escolha ainda mais especial.",
            MIXED_GRILL_PRICE
        ),
        Dish(
            PICANHA_ID,
            "Picanha Grelhada com Macaxeira Frita",
            R.drawable.prato_04,
            "Uma refeição de dar água na boca! Picanha de primeira qualidade," +
                    " grelhada à perfeição e servida com macaxeira frita crocante. Um prato " +
                    "que celebra o melhor da culinária brasileira.",
            PICANHA_PRICE
        ),
        Dish(
            FRENCH_FRIES_ID,
            "Porção de Batatas Fritas com Molho",
            R.drawable.prato_05,
            "Para os amantes de batatas, esta é a escolha ideal. Nossas batatas" +
                    " fritas são cortadas e preparadas na hora para garantir a crocância" +
                    " perfeita. Acompanhadas de uma variedade de molhos incríveis que vão" +
                    " tornar cada mordida ainda mais especial. Acompanhamento perfeito" +
                    " para qualquer refeição.",
            FRENCH_FRIES_PRICE
        ),
        Dish(
            ORANGE_JUICE_ID,
            "Suco de Laranja",
            R.drawable.bebida_01,
            "Um gole de pura refrescância e vitalidade. Nosso suco de laranja " +
                    "é feito com as laranjas mais suculentas e frescas, espremidas na hora" +
                    " para garantir o sabor cítrico e natural que todos adoram. Perfeito" +
                    " para acompanhar suas refeições ou para matar a sede a qualquer hora " +
                    "do dia. Deleite-se com o gosto da natureza em um copo.",
            ORANGE_JUICE_PRICE
        )
    )

    fun getDishesById(id: Int) = dishes.find { it.id == id }

    fun getDishes() = dishes
}