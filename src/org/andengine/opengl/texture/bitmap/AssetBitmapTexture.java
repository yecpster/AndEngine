package org.andengine.opengl.texture.bitmap;

import java.io.IOException;

import org.andengine.opengl.texture.ITextureStateListener;
import org.andengine.opengl.texture.TextureManager;
import org.andengine.opengl.texture.TextureOptions;
import org.andengine.util.adt.io.in.AssetInputStreamOpener;

import android.content.res.AssetManager;

/**
 * (c) 2012 Zynga Inc.
 * 
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 10:45:48 - 02.03.2012
 */
public class AssetBitmapTexture extends BitmapTexture {
    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Fields
    private String pAssetPath;

    // ===========================================================

    // ===========================================================
    // Constructors
    // ===========================================================

    public AssetBitmapTexture(final TextureManager pTextureManager, final AssetManager pAssetManager, final String pAssetPath) throws IOException {
        super(pTextureManager, new AssetInputStreamOpener(pAssetManager, pAssetPath));
        this.pAssetPath = pAssetPath;
    }

    public AssetBitmapTexture(final TextureManager pTextureManager, final AssetManager pAssetManager, final String pAssetPath,
            final BitmapTextureFormat pBitmapTextureFormat) throws IOException {
        super(pTextureManager, new AssetInputStreamOpener(pAssetManager, pAssetPath), pBitmapTextureFormat);
        this.pAssetPath = pAssetPath;
    }

    public AssetBitmapTexture(final TextureManager pTextureManager, final AssetManager pAssetManager, final String pAssetPath,
            final TextureOptions pTextureOptions) throws IOException {
        super(pTextureManager, new AssetInputStreamOpener(pAssetManager, pAssetPath), pTextureOptions);
        this.pAssetPath = pAssetPath;
    }

    public AssetBitmapTexture(final TextureManager pTextureManager, final AssetManager pAssetManager, final String pAssetPath,
            final BitmapTextureFormat pBitmapTextureFormat, final TextureOptions pTextureOptions) throws IOException {
        super(pTextureManager, new AssetInputStreamOpener(pAssetManager, pAssetPath), pBitmapTextureFormat, pTextureOptions);
        this.pAssetPath = pAssetPath;
    }

    public AssetBitmapTexture(final TextureManager pTextureManager, final AssetManager pAssetManager, final String pAssetPath,
            final BitmapTextureFormat pBitmapTextureFormat, final TextureOptions pTextureOptions, final ITextureStateListener pTextureStateListener)
            throws IOException {
        super(pTextureManager, new AssetInputStreamOpener(pAssetManager, pAssetPath), pBitmapTextureFormat, pTextureOptions, pTextureStateListener);
        this.pAssetPath = pAssetPath;
    }

    public String getpAssetPath() {
        return pAssetPath;
    }

    public void setpAssetPath(final String pAssetPath) {
        this.pAssetPath = pAssetPath;
    }

    // ===========================================================
    // Getter & Setter

    // ===========================================================

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================

    // ===========================================================
    // Methods
    // ===========================================================

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================
}
