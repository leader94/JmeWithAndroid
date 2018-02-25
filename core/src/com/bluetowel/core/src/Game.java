/**
 * Created by Pawan on 2/22/2018.
 */
package com.bluetowel.core.src;

import com.jme3.app.SimpleApplication;
import com.jme3.asset.TextureKey;
import com.jme3.material.Material;
import com.jme3.math.Matrix3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.texture.Texture;

public class Game extends SimpleApplication {
    @Override
    public void simpleInitApp() {
        Box b = new Box(1, 1, 1);
        Geometry geom = new Geometry("Box", b);
        Matrix3f matrix3f = new Matrix3f(0, 0, 0, 0, 0, 0, 1, 1, 1);
        geom.setLocalRotation(matrix3f);
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        TextureKey key = new TextureKey("Textures/donald_duck.jpg");
        Texture tex = assetManager.loadTexture(key);
        mat.setTexture("ColorMap", tex);
        geom.setMaterial(mat);
        rootNode.attachChild(geom);
    }

}
