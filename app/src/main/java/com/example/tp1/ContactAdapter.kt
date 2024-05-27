import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.tp1.Contact
import com.example.tp1.DiffCallback
import com.example.tp1.R
import com.example.tp1.databinding.ListeContactBinding

class ContactAdapter : ListAdapter<Contact, ContactAdapter.ContactViewHolder>(DiffCallback()) {

    class ContactViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView){
        private lateinit var binding: ListeContactBinding
        lateinit var nomTextView : TextView
        lateinit var prenomTextView : TextView
        lateinit var telTextView : TextView
            fun bind(c: Contact){
                binding.prenom.setText(c.firstname)
                binding.nom.setText(c.name)
                binding.tel.setText(c.tel)
            }
        }




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.liste_contact, parent, false)
        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contact = getItem(position)
        holder.nomTextView.text = contact.name
        holder.prenomTextView.text = contact.firstname
        holder.telTextView.text = contact.tel
    }




}