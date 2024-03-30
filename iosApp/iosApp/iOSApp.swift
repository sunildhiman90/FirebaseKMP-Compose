import SwiftUI
import Firebase

@main
struct iOSApp: App {
    
    init() {
        FirebaseApp.configure()
    }
    
	var body: some Scene {
		WindowGroup {
			ContentView()
		}
	}
}
