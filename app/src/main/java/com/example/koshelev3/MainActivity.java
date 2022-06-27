importandroidx.appcompat.app.AppCompatActivity;

        importandroid.graphics.Bitmap;
        importandroid.graphics.Color;
        importandroid.os.Bundle;
        importandroid.view.MotionEvent;
        importandroid.view.View;
        importandroid.widget.ImageView;

        publicclassMainActivityextendsAppCompatActivity {
// объявление элементов дизайна
        ImageViewimgView;
        ViewmColorView;
        Bitmapbitmap;
@Override
protectedvoidonCreate(BundlesavedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgView= findViewById(R.id.colorPickers);
        mColorView= findViewById(R.id.displayColors);

        imgView.setDrawingCacheEnabled(true);
        imgView.buildDrawingCache(true);
//Объявление элемента ImageView на изменение цвета по клику
        imgView.setOnTouchListener(newView.OnTouchListener() {
@Override
publicbooleanonTouch(View v, MotionEventevent) {
        if(event.getAction() == MotionEvent.ACTION_DOWN|| event.getAction() == MotionEvent.ACTION_MOVE) {
        bitmap= imgView.getDrawingCache();
        intpixels = bitmap.getPixel((int)event.getX(),(int)event.getY());

        intr = Color.red(pixels);
        intg = Color.green(pixels);
        intb = Color.blue(pixels);

        Stringhex = "#"+ Integer.toHexString(pixels);
        mColorView.setBackgroundColor(Color.rgb(r,g,b));

        }
        returntrue;
        }
        });
        }
        }
