/*
 * Copyright (C) 2012 daniel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package darwin.jopenctm.data;

/**
 *
 * @author daniel
 */
public class AttributeData
{
    public static final float STANDART_UV_PRECISION = 1f / 4096f;
    public static final float STANDART_PRECISION = 1f / 256;

    public final String name;         // Unique name
    public final String materialName;     // File name reference (used only for UV maps)
    public final float precision;
    public final float[] values;   // Attribute/UV coordinate values (per vertex)

    public AttributeData(String name, String materialName, float precision, float[] values)
    {
        this.name = name;
        this.materialName = materialName;
        this.precision = precision;
        this.values = values;
    }

    public boolean checkIntegrity()
    {
        return precision > 0;
    }
}