package com.example.colourguess

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.colourguess.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
     binding.textView.text="RED"
        binding.pink.setImageResource(R.drawable.rosepink)
        binding.red.setImageResource(R.drawable.red)
        binding.gr.setImageResource(R.drawable.green)
        binding.cy.setImageResource(R.drawable.cyan)
        binding.vo.setImageResource(R.drawable.voilet)
        binding.pu.setImageResource(R.drawable.purple)
        binding.sb.setImageResource(R.drawable.skyblue)
        binding.ye.setImageResource(R.drawable.yellow)
        binding.li.setImageResource(R.drawable.img_1)

        checkcolor()

    }

    var t = 0
    var s = 0
    var flag = 0
    private fun checkcolor() {
//        val a= binding.textView.text.toString()
        binding.red.setOnClickListener{
            if(binding.textView.text.toString()=="RED")
            {
                s+=1
                binding.textView.text="YELLOW"
                binding.textView.setTextColor(Color.parseColor("#F10000"))
            }
            else
            {
                flag=1
                binding.textView.text="YOU LOST"

            }
        }
   binding.ye.setOnClickListener{
            if(binding.textView.text.toString()=="YELLOW")
            {
                s+=1
                binding.textView.text="GREEN"
                binding.textView.setTextColor(Color.parseColor("#A00303"))

            }
            else
            {
              flag=1
                binding.textView.text="YOU LOST"

            }
        }
     binding.gr.setOnClickListener{
            if(binding.textView.text.toString()=="GREEN")
            {
                s+=1
                binding.textView.text="CYAN"
                binding.textView.setTextColor(Color.parseColor("#1F8710"))

            }
            else
            {
                flag=1
                binding.textView.text="YOU LOST"

            }
        }
 binding.cy.setOnClickListener{
            if(binding.textView.text.toString()=="CYAN")
            {
                s+=1
                binding.textView.text="VOILET"
                binding.textView.setTextColor(Color.parseColor("#FFFF00"))

            }
            else
            {
              flag=1
                binding.textView.text="YOU LOST"

            }
        }
   binding.vo.setOnClickListener{
            if(binding.textView.text.toString()=="VOILET")
            {
                s+=1
                binding.textView.text="PURPLE"
                binding.textView.setTextColor(Color.parseColor("#00FFFF"))

            }
            else
            {
              flag=1
                binding.textView.text="YOU LOST"

            }
        }
        binding.pu.setOnClickListener{
            if(binding.textView.text.toString()=="PURPLE")
            {
                s+=1
                binding.textView.text="SKYBLUE"
                binding.textView.setTextColor(Color.parseColor("#FF00FF"))

            }
            else
            {
              flag=1
                binding.textView.text="YOU LOST"

            }
        }
    binding.sb.setOnClickListener{
            if(binding.textView.text.toString()=="SKYBLUE")
            {
                s+=1
                binding.textView.text="PINK"
                binding.textView.setTextColor(Color.parseColor("#00F134"))

            }
            else
            {
               flag=1
                binding.textView.text="YOU LOST"

            }
        }
binding.pink.setOnClickListener{
            if(binding.textView.text.toString()=="PINK")
            {
                s+=1
                binding.textView.text="LIME"
                binding.textView.setTextColor(Color.parseColor("#003496"))

            }
            else
            {
                flag=1
                binding.textView.text="YOU LOST"
            }
        }
        binding.li.setOnClickListener{
            if(binding.textView.text.toString()=="LIME")
            {
                s+=1
                binding.textView.text="YOU ARE WINNER!"
                binding.textView.setTextColor(Color.parseColor("#0002F3"))

            }
            else
            {
                flag=1
                binding.textView.text="YOU LOST"

            }
        }

    }
}