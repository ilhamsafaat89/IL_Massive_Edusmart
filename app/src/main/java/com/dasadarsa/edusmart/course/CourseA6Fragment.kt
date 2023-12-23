import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import com.dasadarsa.edusmart.R

class CourseA6Fragment : Fragment() {

    private val PICK_FILE_REQUEST = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_course_a6, container, false)

        val btnUploadTgs = v.findViewById<AppCompatButton>(R.id.btn_uploadtgs)
        btnUploadTgs.setOnClickListener {
            openFilePicker()
        }

        return v
    }

    private fun openFilePicker() {
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.type = "*/*" // Semua jenis file
        startActivityForResult(intent, PICK_FILE_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == PICK_FILE_REQUEST && resultCode == Activity.RESULT_OK && data != null) {
            val selectedFileUri: Uri = data.data!!
            val selectedFileName = getFileName(selectedFileUri)

            // Simpan logika upload file ke server di sini
            // Misalnya, kirim file ke server menggunakan Retrofit atau Volley
            // ...

            // Tampilkan pesan bahwa file telah diupload
            showToast("File $selectedFileName berhasil diupload.")
        }
    }

    private fun getFileName(uri: Uri): String {
        val cursor = requireActivity().contentResolver.query(uri, null, null, null, null)
        cursor?.use {
            if (it.moveToFirst()) {
                val displayNameIndex = it.getColumnIndex(android.provider.OpenableColumns.DISPLAY_NAME)
                if (displayNameIndex != -1) {
                    val fileName = it.getString(displayNameIndex)
                    return fileName ?: "Unknown File"
                }
            }
        }

        // Handle the case where the cursor is null, empty, or column index is -1
        return "Unknown File"
    }

    private fun showToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }
}
