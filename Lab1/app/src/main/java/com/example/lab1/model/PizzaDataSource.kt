package com.example.lab1.model

import com.example.lab1.R

object PizzaDataSource {
    val pizzalist = arrayListOf<Pizza>(
        Pizza(
            name = "Вау! Кебаб",
            isNew = true,
            description = "Мясо говядины, соус ранч, сыр моцарелла, сладкий перец, томаты, красный лук и фирменный томатный соус",
            price = 2900,
            imageRes = R.drawable.kebab
        ),
        Pizza(
            name = "Пепперони с грибами",
            isNew = true,
            description = "Пикантная пепперони, моцарелла, шампиньоны, соус альфредо",
            price = 2000,
            imageRes = R.drawable.pepperoni
        ),
        Pizza(
            name = "Ветчина и огурчики",
            isNew = true,
            description = "Соус ранч, моцарелла, ветчина из цыпленка, маринованные огурчики, красный лук",
            price = 2000,
            imageRes = R.drawable.vet_cuc
        ),
        Pizza(
            name = "Пицца Жюльен",
            isNew = false,
            description = "Цыпленок, шампиньоны, ароматный грибной соус, лук, сухой чеснок, моцарелла, смесь сыров чеддер и пармезан, фирменный соус альфредо",
            price = 2700,
            imageRes = R.drawable.julien
        ),
        Pizza(
            name = "Сырная",
            isNew = false,
            description = "Моцарелла, сыры чеддер и пармезан, соус альфредо",
            price = 1900,
            imageRes = R.drawable.cheese
        ),
        Pizza(
            name = "Пепперони фреш",
            isNew = false,
            description = "Пикантная пепперони, мно-о-ого моцареллы, томаты и томатный соус",
            price = 1900,
            imageRes = R.drawable.pep_fresh
        ),
        Pizza(
            name = "Двойной цыпленок",
            isNew = false,
            description = "Цыпленок, моцарелла, соус альфредо",
            price = 2100,
            imageRes = R.drawable.double_chicken
        ),
        Pizza(
            name = "Чоризо фреш",
            isNew = false,
            description = "Пикантные колбаски чоризо из цыпленка, зеленый перец, моцарелла, томатный соус",
            price = 1900,
            imageRes = R.drawable.chorizo_fresh
        ),
        Pizza(
            name = "Ветчина и сыр",
            isNew = false,
            description = "Ветчина, моцарелла и соус альфредо — просто и со вкусом",
            price = 2000,
            imageRes = R.drawable.vet_cheese
        ),
        Pizza(
            name = "Карбонара",
            isNew = true,
            description = "Ветчина из цыпленка, сыры чеддер и пармезан, томаты, красный лучок, моцарелла, соус альфредо, чеснок и итальянские травы",
            price = 1900,
            imageRes = R.drawable.carbonaro
        ),
        Pizza(
            name = "Сырный цыпленок",
            isNew = false,
            description = "Цыпленок, моцарелла, сыры чеддер и пармезан, сырный соус, томаты, соус альфредо, чеснок",
            price = 2900,
            imageRes = R.drawable.ch_chicken
        ),
        Pizza(
            name = "Бургер-пицца",
            isNew = false,
            description = "Сыр моцарелла, ветчина, лук красный, томаты, маринованные огурчики, соус Бургер, чеснок, томатный соус",
            price = 2700,
            imageRes = R.drawable.burger_pizza
        ),
        Pizza(
            name = "Додо",
            isNew = true,
            description = "Ветчина из цыпленка, сочные митболы, пепперони из цыпленка, томаты, шампиньоны, сладкий перец, красный лук, моцарелла, томатный соус и чеснок",
            price = 2900,
            imageRes = R.drawable.dodo
        ),
        Pizza(
            name = "Аррива!",
            isNew = true,
            description = "Цыпленок, острая чоризо, соус бургер, сладкий перец, красный лук, томаты, моцарелла, соус ранч, чеснок",
            price = 2400,
            imageRes = R.drawable.arriva
        ),
        Pizza(
            name = "Додо Микс",
            isNew = true,
            description = "Четыре любимых пиццы в одной: Карбонара, Песто, Четыре сыра, Ветчина и сыр",
            price = 2900,
            imageRes = R.drawable.dodomix
        ),

        )
}