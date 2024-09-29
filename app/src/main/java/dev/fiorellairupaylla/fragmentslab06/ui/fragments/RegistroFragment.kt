package dev.fiorellairupaylla.fragmentslab06.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.Toast
import dev.fiorellairupaylla.fragmentslab06.R

class RegistroFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_registro, container, false)
        val btSave : Button = view.findViewById(R.id.btsave)
        val etFullname : EditText = view.findViewById(R.id.etFullName)
        val email : EditText = view.findViewById(R.id.etMail)
        val spCountry : Spinner = view.findViewById(R.id.spCountry)
        val rgGender :  RadioGroup = view.findViewById(R.id.rgGender)
        val ckLicence : CheckBox = view.findViewById(R.id.ckLicense)
        val ckCar : CheckBox = view.findViewById(R.id.ckCar)

        ArrayAdapter
            .createFromResource(requireContext(), R.array.country_array,
                                android.R.layout.simple_spinner_item).also {
                                    adapter ->
                                    adapter.setDropDownViewResource(
                                        android.R.layout.simple_spinner_dropdown_item)
                spCountry.adapter = adapter
            }

        var spCountryValue = ""

        spCountry.onItemSelectedListener  = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                spCountryValue = parent?.getItemAtPosition(position).toString();

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        btSave.setOnClickListener {
            val fullName :  String = etFullname.text.toString();
            val email : String  = email.text.toString();
            val genderId : Int = rgGender.checkedRadioButtonId;
            val gender : String = view.findViewById<RadioButton>(genderId).text.toString();
            val country : String = spCountry.selectedItem.toString();
            val licence : Boolean = ckLicence.isChecked;
            val car : Boolean = ckCar.isChecked;
            Toast.makeText(
                requireContext(),
                "Full Name: $fullName Email: $email Gender: $gender Country: $country Licence: $licence Car: $car", Toast.LENGTH_LONG
            ).show()
        }

        return view
    }

}