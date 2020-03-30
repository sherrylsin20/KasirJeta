package id.filkom.ti.cashier

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_pesanan.view.*

class Adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var paymentInstallmentList = listOf<Makanan>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return PaymentInstallmentViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_pesanan,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = paymentInstallmentList.size

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        val movieViewHolder = viewHolder as PaymentInstallmentViewHolder
        movieViewHolder.bindView(paymentInstallmentList[position])
    }

    fun setData(list: List<Makanan>) {
        this.paymentInstallmentList = list
        notifyDataSetChanged()
    }

    inner class PaymentInstallmentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(selectedMakanan: Makanan) {
            itemView.itemMakananText.text =  selectedMakanan.namaMakanan
            itemView.hargaMakananText.text = selectedMakanan.harga.toString()
//            itemView.terms_of_payment.text = paymentInstallmentModel.paymentSteps
//            itemView.payment_amount.text = paymentInstallmentModel.paymentAmount
//            itemView.payment_status.text = paymentInstallmentModel.paymentStatus
        }
    }
}