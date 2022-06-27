import android.content.Context;

import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class ColorPickerextends View {

    public ColorPicker(Context context){

        super(context);//Получение activity

    }
    public ColorPicker(Context context, @NullableAttributeSetattrs){
        super(context, attrs);//Получение activity иатрибута

    }
}
