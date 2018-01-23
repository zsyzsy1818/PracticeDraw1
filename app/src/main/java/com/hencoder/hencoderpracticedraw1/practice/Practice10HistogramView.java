package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        Paint paint = new Paint();
        canvas.drawColor(Color.GRAY);
        paint.setColor(Color.WHITE);
        canvas.drawLine(50,50,50,500,paint);
        canvas.drawLine(50,500,1000,500,paint);
        paint.setTextSize(30);
        canvas.drawText("Froyo",100,550,paint);
        canvas.drawText("GB",200,550,paint);
        canvas.drawText("ICS",300,550,paint);
        canvas.drawText("JB",400,550,paint);
        canvas.drawText("KitKat",500,550,paint);
        canvas.drawText("L",700,550,paint);
        canvas.drawText("M",800,550,paint);
        canvas.drawLine(100,498,200,498,paint);

    }
}
