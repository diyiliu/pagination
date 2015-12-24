package com.diyiliu.web.entity.base;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.HashMap;

/**
 * Description: BaseEntity
 * Author: DIYILIU
 * Update: 2015-11-13 16:59
 */

public class BaseEntity extends HashMap implements Serializable {

    public HashMap toHash() {

        try {
            Field[] fields = this.getClass().getDeclaredFields();

            for (Field field : fields) {

                if (field.isAccessible()) {

                    Object value = field.get(this);
                    if (value != null) {
                        put(field.getName().toUpperCase(), value);
                    }
                } else {
                    field.setAccessible(true);

                    Object value = field.get(this);
                    if (value != null) {
                        put(field.getName().toUpperCase(), value);
                    }

                    field.setAccessible(false);
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return this;
    }

    public BaseEntity toEntity() {

        try {
            Field[] fields = this.getClass().getDeclaredFields();

            for (Field field : fields) {

                String key = field.getName();
                if (this.containsKey(key)) {

                    Object value = get(key);
                    if (value != null) {
                        if (field.isAccessible()) {

                            field.set(this, value);
                        } else {
                            field.setAccessible(true);
                            field.set(this, value);
                            field.setAccessible(false);
                        }
                    }
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return this;
    }

    @Override
    public boolean containsKey(Object key) {

        if (key instanceof String) {

            String str = (String) key;
            if (super.containsKey(str) ||
                    super.containsKey(str.toUpperCase()) ||
                    super.containsKey(str.toLowerCase())) {

                return true;
            }
        }
        return super.containsKey(key);
    }

    @Override
    public Object get(Object key) {

        if (key instanceof String) {

            String str = (String) key;
            if (super.containsKey(str)) {

                return super.get(key);
            } else if (super.containsKey(str.toUpperCase())) {

                return super.get(str.toUpperCase());
            } else if (super.containsKey(str.toLowerCase())) {

                return super.get(str.toLowerCase());
            }
        }

        return super.get(key);
    }
}
