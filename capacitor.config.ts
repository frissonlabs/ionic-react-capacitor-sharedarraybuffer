import { CapacitorConfig } from "@capacitor/cli";

const config: CapacitorConfig = {
	appId: "io.ionic.starter",
	appName: "ionic-react-capacitor-sharedarraybuffer",
	webDir: "build",
	bundledWebRuntime: false,
	ios: {
		limitsNavigationsToAppBoundDomains: true,
	},
	// server: {
	// 	url: "http://localhost",
	// },
};

export default config;
