package base
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

open class BaseViewModel() : ViewModel() {

  val coroutineContext = SupervisorJob() + CoroutineExceptionHandler { _, throwable ->
    println("BaseViewModel: Error: ${throwable.message}")
    //show error message using snackbar for all errors
  }

  private var job: Job? =  null

  fun launchWithCatchingException(block: suspend CoroutineScope.() -> Unit) {
    job = viewModelScope.launch(
      context = coroutineContext,
      block = block
    )
  }

  override fun onCleared() {
    super.onCleared()
    job?.cancel()
  }

}