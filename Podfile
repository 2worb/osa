platform :ios, '11.4'

swift_version = '5.0'

target 'Q-App' do
  # Comment the next line if you're not using Swift and don't want to use dynamic frameworks
  use_frameworks!

  # Funtasty architecture pods
  pod 'FuntastyKit', '~> 1.6'
  pod 'FTAPIKit', '~> 0.5'
  pod 'FTAPIKit', subspecs: ['PromiseKit']
  pod 'CellKit', '~> 0.2'

  # Third-party pods
  pod 'PromiseKit', '~> 6.0'
  pod 'PromiseKit', subspecs: ['UIImagePickerController']
  pod 'lottie-ios', '~> 3.0'
  pod 'SwiftJWT'
  pod 'GoogleMobileVision/TextDetector'
  pod 'AppCenter'

  # Tools
  pod 'SwiftLint'

  target 'Q-AppTests' do
    inherit! :search_paths
    # Pods for testing
  end
end
