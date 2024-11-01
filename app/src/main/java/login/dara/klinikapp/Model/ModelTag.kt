package login.dara.klinikapp.Model

data class ModelTag(
    val tag : String
)

object Listtag{
    fun getModel() : List<ModelTag>{
        val item1 =  ModelTag(
            "#health"
        )
        val item2 =  ModelTag(
            "#Doctor"
        )
        val item3 =  ModelTag(
            "#health"
        )
        val item4 =  ModelTag(
            "#health"
        )
        val item5 =  ModelTag(
            "#health"
        )
        val item6 =  ModelTag(
            "#Doctor"
        )
        val item7 =  ModelTag(
            "#health"
        )
        val item8 =  ModelTag(
            "#health"
        )
        val item9 =  ModelTag(
            "#health"
        )
        val item10 =  ModelTag(
            "#Doctor"
        )
        val item11 =  ModelTag(
            "#health"
        )
        val item12 =  ModelTag(
            "#health"
        )
        val item13 =  ModelTag(
            "#health"
        )
        val item14 =  ModelTag(
            "#Doctor"
        )
        val item15=  ModelTag(
            "#health"
        )
        val item16 =  ModelTag(
            "#health"
        )

        val itemList : ArrayList<ModelTag> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        itemList.add(item5)
        itemList.add(item6)
        itemList.add(item7)
        itemList.add(item8)
        itemList.add(item9)
        itemList.add(item10)
        itemList.add(item11)
        itemList.add(item12)
        itemList.add(item13)
        itemList.add(item14)
        itemList.add(item15)
        itemList.add(item16)

        return itemList
    }
}

