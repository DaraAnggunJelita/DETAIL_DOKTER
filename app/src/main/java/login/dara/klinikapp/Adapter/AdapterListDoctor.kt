package login.dara.klinikapp.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import login.dara.klinikapp.DetailDoctors
import login.dara.klinikapp.Model.ModelListDoctors
import login.dara.klinikapp.PageDoctors
import login.dara.klinikapp.R

class AdapterListDoctor (
    val itemMenuDoctor : List<ModelListDoctors>,
    val getActivity: PageDoctors
): RecyclerView.Adapter<AdapterListDoctor.MyViewHolder>(){
    class MyViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
        var imgDoctor : ImageView = itemView.findViewById(R.id.imgDoctor)
        var txtNamaDoctor : TextView = itemView.findViewById(R.id.namaDoctor)
        var txtBidangDoctor : TextView = itemView.findViewById(R.id.SpesDoctor)
        var txtJumlahRating : TextView = itemView.findViewById(R.id.JumlahReview)
        var txtAngkaRating : TextView = itemView.findViewById(R.id.angkaRating)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_listdoctor,parent,false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemMenuDoctor.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemMenuDoctor[position]
        holder.imgDoctor.setImageResource(currentItem.imgDoctor)
        holder.txtNamaDoctor.text = currentItem.namaDoctor
        holder.txtBidangDoctor.text = currentItem.SpesDoctor
        holder.txtJumlahRating.text = currentItem.JumlahReview
        holder.txtAngkaRating.text = currentItem.angkaRating

        holder.itemView.setOnClickListener(){
            val intent = Intent(getActivity, DetailDoctors::class.java)

            intent.putExtra("imgDoctor",itemMenuDoctor[position].imgDoctor)
            intent.putExtra("namaDoctor",itemMenuDoctor[position].namaDoctor)
            intent.putExtra("SpesDoctor",itemMenuDoctor[position].SpesDoctor)
            intent.putExtra("JumlahReview",itemMenuDoctor[position].JumlahReview)
            intent.putExtra("angkaRating",itemMenuDoctor[position].angkaRating)

            getActivity.startActivity(intent)
        }
    }

}
