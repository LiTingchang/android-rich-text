
package com.ltc.richtext;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.ltc.richtext.util.RichText;
import com.ltc.richtext.util.SpanList;

public class MainActivity extends Activity {
    
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        textView = (TextView) findViewById(R.id.textView);
        RichText richText = new RichText();
        
        SpanList foregroundClorSpan = new SpanList();
        foregroundClorSpan.appendSpan(new ForegroundColorSpan(Color.RED));
        richText.append("ForegroundColorSpan", foregroundClorSpan);
        
        SpanList backgroundClorSpan = new SpanList();
        backgroundClorSpan.appendSpan(new BackgroundColorSpan(Color.BLUE));
        richText.append("BackgroundColorSpan", backgroundClorSpan);
        
        SpanList underLineSpan = new SpanList();
        underLineSpan.appendSpan(new UnderlineSpan());
        richText.append("UnderlineSpan", underLineSpan);
        
        SpanList urlSpan = new SpanList();
        urlSpan.appendSpan(new URLSpan("tel:1111111111"));
//        spanList2.appendSpan(new URLSpan("http://www.google.com"));
        richText.append("URLSpan", urlSpan);
        
        SpanList styleSpan = new SpanList();
        styleSpan.appendSpan(new StyleSpan(Typeface.BOLD_ITALIC));
        richText.append("StyleSpan", styleSpan);
        
        richText.append("nospan", null);
        
        textView.setText(richText.toSpannableString());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

}
