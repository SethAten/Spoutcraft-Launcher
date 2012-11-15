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
package org.spoutcraft.launcher.api;

import java.io.File;

import org.spoutcraft.launcher.modpack.Modpack;
import org.spoutcraft.launcher.util.Utils;

public abstract class Directories {
	private static File configDir = new File(Utils.getWorkingDirectory(), "config");
	private static File skinDir = new File(Utils.getWorkingDirectory(), "skins");

	private File backupDir;
	private File binDir;
	private File binCacheDir;
	private File savesDir;
	private File updateDir;
	private File modsDir;
	private File modpackDir;
	private File resourcesDir;
	private File modpackConfigDir;

	public void setModpack(Modpack modpack) {
		modpackDir = new File(Utils.getWorkingDirectory(), modpack.getName());
		modpackDir.mkdirs();

		backupDir = new File(modpackDir, "backups");
		binDir = new File(modpackDir, "bin");
		binCacheDir = new File(modpackDir, "cache");
		modpackConfigDir = new File(modpackDir, "config");
		savesDir = new File(modpackDir, "saves");
		updateDir = new File(modpackDir, "temp");
		modsDir = new File(modpackDir, "mods");
		resourcesDir = new File(modpackDir, "resources");

		backupDir.mkdirs();
		binDir.mkdirs();
		binCacheDir.mkdirs();
		modpackConfigDir.mkdirs();
		savesDir.mkdirs();
		updateDir.mkdirs();
		modsDir.mkdirs();
		resourcesDir.mkdirs();

		System.setProperty("minecraft.applet.TargetDirectory", modpackDir.getAbsolutePath());
	}

	public final File getModpackDir() {
		return modpackDir;
	}

	public final File getModsDir() {
		return modsDir;
	}

	public final File getModpackConfigDir() {
		return modpackConfigDir;
	}

	public final File getResourcesDir() {
		return resourcesDir;
	}

	public final File getBinDir() {
		return binDir;
	}

	public final File getBinCacheDir() {
		return binCacheDir;
	}

	public final File getBackupDir() {
		return backupDir;
	}

	public static final File getConfigDir() {
		return configDir;
	}

	public final File getSavesDir() {
		return savesDir;
	}

	public final File getUpdateDir() {
		return updateDir;
	}

	public static final File getSkinDir() {
		return skinDir;
	}
}
