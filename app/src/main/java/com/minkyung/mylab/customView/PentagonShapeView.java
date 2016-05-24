package com.minkyung.mylab.customView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;


public class PentagonShapeView extends View{
    public PentagonShapeView(Context context) {
        super(context);
    }

    public PentagonShapeView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PentagonShapeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();

        // 시작점
        int x = 0;
        int y = 0;

        int height = 120;
        double width = (double) height * 1.4;


        Point p1 = new Point(x,y);
        Point p2 = new Point(x, y + height);
        Point p3 = new Point(x + height, y + height);
        Point p4 = new Point(x + (int)width, y + height/2);
        Point p5 = new Point(x + height, y);

        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        path.moveTo(p1.x, p1.y);
        path.lineTo(p2.x, p2.y);
        path.lineTo(p3.x, p3.y);
        path.lineTo(p4.x, p4.y);
        path.lineTo(p5.x, p5.y);

        canvas.drawPath(path, paint);
    }

}
