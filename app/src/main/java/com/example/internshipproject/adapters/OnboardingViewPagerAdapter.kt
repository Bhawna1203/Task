package com.example.internshipproject.adapters

import android.content.Context
import android.graphics.BitmapRegionDecoder.newInstance
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.internshipproject.R
import com.example.internshipproject.fragments.OnboardingFragment
import org.xmlpull.v1.XmlPullParserFactory.newInstance
import java.lang.reflect.Array.newInstance
import javax.xml.datatype.DatatypeFactory.newInstance
import javax.xml.transform.TransformerFactory.newInstance

class OnboardingViewPagerAdapter(
    fragmentActivity: FragmentActivity,
    private val context: Context
) :
    FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> OnboardingFragment.newInstance(
                context.resources.getString(R.string.title_onboarding_1),
                context.resources.getString(R.string.description_onboarding_1),
                R.raw.lottie_developer
            )
            1 -> OnboardingFragment.newInstance(
                context.resources.getString(R.string.title_onboarding_2),
                context.resources.getString(R.string.description_onboarding_2),
                R.raw.lottie_developer
            )
            else -> OnboardingFragment.newInstance(
                context.resources.getString(R.string.title_onboarding_3),
                context.resources.getString(R.string.description_onboarding_3),
                R.raw.lottie_developer
            )
        }
    }

    override fun getItemCount(): Int {
        return 3
    }
}


