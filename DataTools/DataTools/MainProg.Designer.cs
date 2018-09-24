namespace DataTools
{
    partial class MainProg
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.homeToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.preprocessingToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.gPSDataToSegmentToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.menuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // menuStrip1
            // 
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.homeToolStripMenuItem,
            this.preprocessingToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(800, 24);
            this.menuStrip1.TabIndex = 0;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // homeToolStripMenuItem
            // 
            this.homeToolStripMenuItem.Name = "homeToolStripMenuItem";
            this.homeToolStripMenuItem.Size = new System.Drawing.Size(52, 20);
            this.homeToolStripMenuItem.Text = "Home";
            // 
            // preprocessingToolStripMenuItem
            // 
            this.preprocessingToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.gPSDataToSegmentToolStripMenuItem});
            this.preprocessingToolStripMenuItem.Name = "preprocessingToolStripMenuItem";
            this.preprocessingToolStripMenuItem.Size = new System.Drawing.Size(98, 20);
            this.preprocessingToolStripMenuItem.Text = "Pre-processing";
            // 
            // gPSDataToSegmentToolStripMenuItem
            // 
            this.gPSDataToSegmentToolStripMenuItem.Name = "gPSDataToSegmentToolStripMenuItem";
            this.gPSDataToSegmentToolStripMenuItem.Size = new System.Drawing.Size(186, 22);
            this.gPSDataToSegmentToolStripMenuItem.Text = "GPS Data to Segment";
            // 
            // MainProg
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.menuStrip1);
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "MainProg";
            this.Text = "Data Tools";
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem homeToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem preprocessingToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem gPSDataToSegmentToolStripMenuItem;
    }
}

