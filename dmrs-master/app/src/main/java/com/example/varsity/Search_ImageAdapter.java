package com.example.varsity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.viewpager.widget.PagerAdapter;

public class Search_ImageAdapter extends PagerAdapter {
    Context mmContext;
    LayoutInflater searchinflater;



    public int[] searchsliderImageId = {

            R.drawable.progresswall2_pic, R.drawable.progresswall_pic,R.drawable.progresswall2_pic,R.drawable.progresswall_pic
    };
    public String[] searchsliderTextId = {"Having figured the reasons to invest, the next obvious question is where would one invest, and what are the returns one can expect by making these investments?\n" +
            "\n" +
            "The first thing when it comes to investing is to choose an appropriate asset which matches your risk profile. More on 'Risk profile' later but here are the most popular assets one can invest in.\n" +
            "\n" +
            "Fixed income instruments:\n" +
            "\n" +
            "Equity\n" +
            "\n" +
            "Real estate\n" +
            "\n" +
            "• Gold\n" +
            "\n" +
            "Whichever way you look at it, these are the only 4 viable investment option available. The trick is to make sure we invest wisely, to ensure our investment results in a reasonable rate of return for every unit of risk undertaken. The risk and reward of investments go hand in hand.\n" +
            "\n" +
            "For example, if an investment is considered risky, then it most likely offers a high return. If an asset is considered safe, then the returns will be moderate too. So risk and reward are like two sides of the same coin.","Investing your hard-earned money in assets, which can generate enough returns to sustain through your retired life is very important. Investing is a life long affair and one has to devise an efficient plan to save and invest throughout the working years.\n" +
            "\n" +
            "Before we understand why one should invest.\n" +
            "\n" +
            "let us figure out what happens if we choose not\n" +
            "\n" +
            "to invest.\n" +
            "\n" +
            "Assume you earn 50K per month, of which, you spend 30K towards the cost of living. and therefore left with 20K in surplus every month. You choose not to invest this monthly surplus and leave that cash as-is. Now, the question is, at this rate, how much money will you have by the time you retire? For the sake of simplicity, let us ignore. the effect of tax and make a few simple\n" +
            "\n" +
            "assumptions -\n" +
            "\n" +
            ". Your employer is kind enough to give you a 10% salary hike every year\n" +
            "\n" +
            "• The cost of living increases by 8% year on year\n" +
            "\n" +
            "You are 30 years old (now) and plan to retire at the age of 50, this implies you have 20 working years left\n" +
            "\n" +
            "• You don't intend to work post-retirement\n" +
            "\n" +
            "• Your expenses are fixed and don't foresee any other expense\n" +
            "\n" +
            "• The balance cash of 20K per month is retained in the form of cash, probably in your bank's savings account\n" +
            "\n" +
            "Take some time, maybe get a pen and paper and do the math. At this rate, can you work out the amount of money you would be left with by the time you retire?","As a company evolves from its early days, it attracts partners of all sorts who place their faith (and bets) in the company and its promoter's vision. These partners or investors are often called the Angel investors, Venture Capitalist, and Private Equity Investors. These investors provide funds to the company at various stages of growth. In exchange for the funds, they receive equity shares of the company.\n" +
            "\n" +
            "The company can file for an IPO just to provide these early investors with an exit for their early investment.\n" +
            "\n" +
            "Here, the shares held by the investors are\n" +
            "\n" +
            "offered to the public. In May 2018, Lemon Tree\n" +
            "\n" +
            "Hotels Limited, filed for a 1040 Crore IPO to\n" +
            "\n" +
            "provide an exit for their initial investors.\n" +
            "\n" +
            "Finally, one last reason for companies to file for an IPO, not a major one though, is to increase the visibility of the company. Visibility improves when the company's shares are publicly held and traded. This also has a positive impact on its growth.\n" +
            "\n" +
            "Now that we are aware of the major reasons for a company to apply for an IPO, we will now quickly look at a few jargons associated with IPO.","Every step involved in the IPO follows the SEBI's prescribed norms. In general, the following are the sequence of events.\n" +
            "\n" +
            "• Appoint a merchant banker. In case of a large public issue, the company can appoint multiple merchant bankers\n" +
            "\n" +
            "Intimate SEBI with a registration statement. The registration statement contains the company's background and the reasons to go public\n" +
            "\n" +
            "SEBI reviews the registration statement and takes a call on the worthiness of the IPO. SEBI can request for additional details if required.\n" +
            "\n" +
            "The company puts out the Draft red\n" +
            "\n" +
            "herring prospectus (DRHP), which is at\n" +
            "\n" +
            "public document\n" +
            "\n" +
            "The DRHP filed by the company contains the following information -\n" +
            "\n" +
            "The size of the IPO • The number of shares offered to the\n" +
            "\n" +
            "public\n" +
            "\n" +
            "Reasons for the IPO along with fund utilization plan\n" +
            "\n" +
            "Business description including the revenue model, expenditure details.\n" +
            "\n" +
            "Complete financial statements\n" +
            "\n" +
            "• Management's view on their business prospects\n" +
            "\n" +
            "• Risks involved in running the business\n" +
            "\n" +
            "Consider the DRHP as the most sacred document while looking for the company's IPO details."};

    private Object View;

    public Search_ImageAdapter(Context context){
        this.mmContext=context;
    }
    public int getCount() {
        return searchsliderImageId.length;

    }


    public boolean isViewFromObject(android.view.View view, Object object) {
        return (view==object);


    }



    public Object instantiateItem(ViewGroup container, int position){

        searchinflater = (LayoutInflater)mmContext.getSystemService(mmContext.LAYOUT_INFLATER_SERVICE);
        View view= searchinflater.inflate(R.layout.search_slide,container,false);


        LinearLayout linearLayout=(LinearLayout)view.findViewById(R.id.linearLayout_search_slide);
        ImageView imageView=(ImageView)view.findViewById(R.id.search_slideimg);
        TextView tl_textView=(TextView)view.findViewById(R.id.search_slidetext);
        imageView.setImageResource(searchsliderImageId[position]);
        tl_textView.setText(searchsliderTextId[position]);
        container.addView(view);
        return view;

//        ImageView imageView=new ImageView(mContext);
//        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//        imageView.setImageResource(sliderImageId[position]);
//        ((ViewPager)container).addView(imageView,0);
//        return imageView;
    }
    public void destroyItem(ViewGroup container,int position,Object object){
        container.removeView((LinearLayout)object);
    }
}

