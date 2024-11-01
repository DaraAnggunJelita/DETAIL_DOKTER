package login.dara.klinikapp.Model

import login.dara.klinikapp.R


data class ModelMenuIcon(
    var imgMenu : Int,
    var namaMenu : String

)

object ListMenu {
    fun getModel() : List<ModelMenuIcon> {
        val item1 =  ModelMenuIcon(
            R.drawable.icon_eye,
            "Ophthalmologyst"
        )

        val item2 =  ModelMenuIcon(
            R.drawable.icon_heart,
            "Cardiologyst"
        )

        val item3 =  ModelMenuIcon(
            R.drawable.icontooth,
            "Dentist"
        )
        val item4 =  ModelMenuIcon(
            R.drawable.icon_heart,
            "Dentist"
        )
        val item5 =  ModelMenuIcon(
            R.drawable.icon_eye,
            "Ophthalmologyst"
        )
        val item6 =  ModelMenuIcon(
            R.drawable.icon_heart,
            "Cardiologyst"
        )


        val itemList : ArrayList<ModelMenuIcon> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        itemList.add(item5)
        itemList.add(item6)

        return itemList
    }
}

