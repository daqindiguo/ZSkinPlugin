package com.zhengsr.skinlib.callback;

import android.content.res.Resources;
import android.view.View;

import com.zhengsr.skinlib.entity.SkinAttr;

/**
 * @author by  zhengshaorui on 2019/9/6
 * Describe:
 */
public abstract class ISkinDelegate<T extends View> extends IBaseSkinDelegate<T, SkinAttr> {
    @Override
    public void apply(T view, SkinAttr attr, Resources outResource, String pkgName) {
        super.apply(view, attr, outResource, pkgName);
        onApply(view,attr);
    }

    public abstract void onApply(T view,SkinAttr attr);





}
