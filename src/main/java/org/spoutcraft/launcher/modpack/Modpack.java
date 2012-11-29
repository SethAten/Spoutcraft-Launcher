/*
 * This file is part of Spoutcraft.
 *
 * Copyright (c) 2011-2012, SpoutDev <http://www.spout.org/>
 * Spoutcraft is licensed under the SpoutDev License Version 1.
 *
 * Spoutcraft is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the SpoutDev License Version 1.
 *
 * Spoutcraft is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the SpoutDev License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://www.spout.org/SpoutDevLicenseV1.txt> for the full license,
 * including the MIT license.
 */
package org.spoutcraft.launcher.modpack;

import java.util.List;

import org.spoutcraft.launcher.Settings;
import org.spoutcraft.launcher.exceptions.NoMirrorsAvailableException;
import org.spoutcraft.launcher.rest.Library;
import org.spoutcraft.launcher.rest.Versions;

public abstract class Modpack {
	public static String VANILLA = "vanilla";
	public static String SPOUTCRAFT = "spout";
	public static String TECHNIC = "technic";
	public static String TEKKIT = "tekkit";

	protected String build;

	public abstract String getName();

	public abstract String getBuild();

	public abstract List<Library> getLibraries();

	public abstract String getMD5();

	public abstract String getPatchURL();

	public abstract String getSpoutcraftURL() throws NoMirrorsAvailableException;

	public abstract String getInstalledBuild();

	public String getMinecraftVersion() {
		String selected = Settings.getMinecraftVersion();
		if (selected.equals(Settings.DEFAULT_MINECRAFT_VERSION)) {
			//TODO: fix
			return "1.3.2";
			//return getLatestMinecraftVersion();
		} else {
			return selected;
		}
	}

	public String getLatestMinecraftVersion() {
		return Versions.getLatestMinecraftVersion();
	}

	public String getMinecraftURL(String user) {
		return "http://s3.amazonaws.com/MinecraftDownload/minecraft.jar?user=" + user + "&ticket=1";
	}

}
